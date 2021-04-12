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
	const onresponse = async (res) => {
		if (res.ok) {
			goto(res.headers.get('location'));
		}
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

</style>