package qz;

import ey.j2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 implements hs1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f105389b;

    public d0(String url, int i13) {
        this.f105388a = i13;
        if (i13 == 1) {
            this.f105389b = url;
        } else {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f105389b = url;
        }
    }

    @Override // hs1.p
    public final void a(boolean z13, hs1.x xVar) {
        int i13 = this.f105388a;
        String str = this.f105389b;
        switch (i13) {
            case 0:
                new j2(str, z13, dl2.b.C0(xVar, null)).i();
                break;
            default:
                new j2(str, z13, dl2.b.C0(xVar, null)).i();
                break;
        }
    }
}
