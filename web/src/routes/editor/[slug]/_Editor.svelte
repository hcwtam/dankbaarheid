<script>
	// import { goto } from '$app/navigation';
	// import ListErrors from '$lib/ListErrors.svelte';
	// import { ajax } from '$lib/actions.js';
	export let entry;
	export let slug;

	// const onsubmit = () => {
	// 	publishing = true;
	// };
	// const onresponse = async (res) => {
	// 	if (res.ok) {
	// 		goto(res.headers.get('location'));
	// 	}
	// };
</script>

<div class="editor-page">
	<div class="container page">
		<div class="row">
			<div class="col-md-10 offset-md-1 col-xs-12">
				<!-- <ListErrors {errors} /> -->

				<form
					action={slug ? `/entry/${slug}.json?_method=put` : `/entry.json`}
					method="post"
				>
					<fieldset>

						<fieldset class="form-group">
							<input
								class="form-control"
                                rows="8"
								type="text"
								placeholder="What's this entry about?"
								bind:value={entry.content}
							/>
						</fieldset>

						<button class="btn btn-lg pull-xs-right btn-primary">
							Publish Entry
						</button>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</div>