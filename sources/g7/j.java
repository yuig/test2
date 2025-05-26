package g7;

import android.content.Context;

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f63796a;

    /* renamed from: b, reason: collision with root package name */
    public final e f63797b;

    public j(Context context, r rVar) {
        this.f63796a = context.getApplicationContext();
        this.f63797b = rVar;
    }

    @Override // g7.e
    public final f a() {
        return new k(this.f63796a, this.f63797b.a());
    }
}
