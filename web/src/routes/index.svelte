<script>
	import Carousel from '$lib/Carousel.svelte';
	import Menu from '../lib/Menu.svelte';
</script>

<main>
	<h1>My diaries</h1>

	<Carousel />
	<Menu />

</main>

<style>
	main {
		padding: 1em;
		margin: 0 auto;
	}

	h1 {
		font-size: 2.5rem;
		font-weight: 500;
		line-height: 1.1;
		text-align: center;
	}

	p {
		max-width: 14rem;
		margin: 2rem auto;
		line-height: 1.35;
	}

	@media (min-width: 480px) {
		h1 {
			max-width: none;
		}

		p {
			max-width: none;
		}
	}
</style>
