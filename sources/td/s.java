package td;

import java.io.File;

/* loaded from: classes.dex */
public final class s implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f117434a;

    public s(r rVar) {
        this.f117434a = rVar;
    }

    @Override // td.c0
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, nd.l lVar) {
        File file = (File) obj;
        return new b0(new ge.d(file), new j(1, file, this.f117434a));
    }
}
