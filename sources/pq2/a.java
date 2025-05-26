package pq2;

import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f100986a = new a();

    @Override // pq2.p
    public final Object a(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        try {
            wo2.j jVar = new wo2.j();
            responseBody.getF95981f().f0(jVar);
            return ResponseBody.create(responseBody.getF95751d(), responseBody.getF95980e(), jVar);
        } finally {
            responseBody.close();
        }
    }
}
