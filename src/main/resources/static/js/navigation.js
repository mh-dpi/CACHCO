document.addEventListener('DOMContentLoaded', function() {
    // Mobile menu toggle
    const mobileMenuButton = document.querySelector('.mobile-menu-button');
    const mobileMenu = document.querySelector('.mobile-menu');

    mobileMenuButton?.addEventListener('click', () => {
        mobileMenu?.classList.toggle('hidden');
    });

    // Mobile dropdowns
    const mobileDropdowns = document.querySelectorAll('.mobile-nav-dropdown button');

    mobileDropdowns.forEach(dropdown => {
        dropdown.addEventListener('click', (e) => {
            const content = e.currentTarget.nextElementSibling;
            content?.classList.toggle('hidden');

            // Rotate arrow icon
            const arrow = dropdown.querySelector('svg');
            arrow?.classList.toggle('rotate-180');
        });
    });

    // Close mobile menu on window resize
    window.addEventListener('resize', () => {
        if (window.innerWidth >= 1024) { // lg breakpoint
            mobileMenu?.classList.add('hidden');
        }
    });
});
