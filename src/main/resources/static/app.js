const button = document.getElementById('fetch-greeting');
const resultSection = document.getElementById('result');

button.addEventListener('click', async () => {
    resultSection.textContent = 'Loading...';

    try {
        const apiBase = window.location.protocol === 'file:' ? 'http://localhost:8080' : '';
        const response = await fetch(`${apiBase}/api/hello`);
        if (!response.ok) {
            const errorText = await response.text();
            throw new Error(errorText || 'Request failed');
        }

        const data = await response.json();
        resultSection.textContent = data.message;
    } catch (error) {
        resultSection.textContent = error.message;
    }
});
