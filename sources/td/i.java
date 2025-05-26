package td;

import java.io.File;

/* loaded from: classes.dex */
public final class i implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117397a;

    public /* synthetic */ i(int i13) {
        this.f117397a = i13;
    }

    @Override // td.c0
    public final boolean a(Object obj) {
        switch (this.f117397a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        switch (this.f117397a) {
            case 0:
                File file = (File) obj;
                return new b0(new ge.d(file), new h(file));
            default:
                return null;
        }
    }
}
