<script>
import { valueTemplate } from "./_valueTemplate";
import * as api from '$lib/api.js'
import { goto } from '$app/navigation';

	export let entry;
	export let slug;
	let value = valueTemplate;
	if (entry) value = entry.content;

	const onSubmit = async () => {
		const send = entry ? api.put : api.post;
		const body = {
				content: value,
				date: slug
			}
		const res = await send(entry?`entries/${slug}`:'entries', body);
		if (res) goto(`/entries/${slug}`)
	};

</script>

<form
	on:submit|preventDefault={onSubmit}
>

			<!-- svelte-ignore a11y-autofocus -->
			<textarea
				class="content"
				type="text"
				placeholder="What's this entry about?"
				autofocus
				bind:value={value}
			/>

		<button>
			Publish Entry
		</button>

</form>


<style>
	.content {
		position: relative;
		height: 600px;
		width: 100%;
		font-family: -apple-system, BlinkMacSystemFont, 'Roboto Slab', Roboto, Oxygen, Ubuntu, Cantarell,
		'Open Sans', 'Helvetica Neue', sans-serif;
		border: none;
		background-color: inherit;
		overflow-y: auto;
		resize: none;
		padding: 20px;
	}

	form {
		border: none;
	}

	button {
		position: absolute;
		right: 19px;
		top: 19px;
		background-color: #ad573c;
		color: #fff;
		padding: 10px;
		border-radius: 5px;
		box-shadow: rgba(161, 112, 80, 0.7) 0 4px 5px;
	}

</style>