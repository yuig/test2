package q7;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import pk.c1;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: h, reason: collision with root package name */
    public final String f102654h;

    /* renamed from: i, reason: collision with root package name */
    public final j f102655i;

    /* renamed from: j, reason: collision with root package name */
    public final u f102656j;

    public l(long j13, androidx.media3.common.b bVar, c1 c1Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(bVar, c1Var, rVar, arrayList, list, list2);
        Uri.parse(((b) c1Var.get(0)).f102600a);
        long j14 = rVar.f102677e;
        j jVar = j14 <= 0 ? null : new j(null, rVar.f102676d, j14);
        this.f102655i = jVar;
        this.f102654h = null;
        this.f102656j = jVar == null ? new u(new j(null, 0L, -1L)) : null;
    }

    @Override // q7.m
    public final String k() {
        return this.f102654h;
    }

    @Override // q7.m
    public final p7.k l() {
        return this.f102656j;
    }

    @Override // q7.m
    public final j m() {
        return this.f102655i;
    }
}
