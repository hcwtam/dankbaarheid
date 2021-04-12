<script>
	import '../app.css';
	import Nav from '$lib/Nav.svelte'
	import { navigating } from '$app/stores';
	import PreloadingIndicator from '$lib/PreloadingIndicator.svelte';
</script>

{#if $navigating}
	<PreloadingIndicator />
{/if}

<Nav/>
<slot />
