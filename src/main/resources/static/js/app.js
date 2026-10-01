const navLinks = [...document.querySelectorAll('.nav-links a')];
const sections = [...document.querySelectorAll('main section[id]')];

function updateActiveNav() {
  const y = window.scrollY + 120;
  let activeId = sections[0]?.id;

  for (const section of sections) {
    if (section.offsetTop <= y) activeId = section.id;
  }

  navLinks.forEach(link => {
    link.classList.toggle('active', link.getAttribute('href') === `#${activeId}`);
  });
}

window.addEventListener('scroll', updateActiveNav, { passive: true });
updateActiveNav();

const observer = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) entry.target.classList.add('visible');
  });
}, { threshold: 0.12 });

document.querySelectorAll('.reveal').forEach(el => observer.observe(el));

const toggle = document.getElementById('themeToggle');
toggle?.addEventListener('click', () => {
  document.documentElement.classList.toggle('light');
});
