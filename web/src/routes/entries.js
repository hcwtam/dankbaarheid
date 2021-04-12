import * as api from '$lib/api.js';

export async function get() {
	const entries = await api.get(`entries`);

	return {
		body: entries
	};
}
