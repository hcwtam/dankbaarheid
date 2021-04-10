import * as api from '$lib/api.js';

export async function get({ params, context }) {
	const { slug } = params;
	const entry = await api.get(`entries/${slug}.json`, context.user && context.user.token);

	return {
		body: entry
	};
}

export async function put(request) {
	console.log('put', request);
}
