package sm2;

import im2.d0;
import java.security.AccessControlException;
import java.util.HashMap;
import rm2.c0;
import rm2.e0;

/* loaded from: classes2.dex */
public final class i implements e0 {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f113289i;

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f113290j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f113291a;

    /* renamed from: b, reason: collision with root package name */
    public String f113292b;

    /* renamed from: c, reason: collision with root package name */
    public int f113293c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f113294d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f113295e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f113296f;

    /* renamed from: g, reason: collision with root package name */
    public b f113297g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f113298h;

    static {
        try {
            f113289i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f113289i = false;
        }
        HashMap hashMap = new HashMap();
        f113290j = hashMap;
        hashMap.put(ym2.b.j(new ym2.c("kotlin.jvm.internal.KotlinClass")), b.CLASS);
        hashMap.put(ym2.b.j(new ym2.c("kotlin.jvm.internal.KotlinFileFacade")), b.FILE_FACADE);
        hashMap.put(ym2.b.j(new ym2.c("kotlin.jvm.internal.KotlinMultifileClass")), b.MULTIFILE_CLASS);
        hashMap.put(ym2.b.j(new ym2.c("kotlin.jvm.internal.KotlinMultifileClassPart")), b.MULTIFILE_CLASS_PART);
        hashMap.put(ym2.b.j(new ym2.c("kotlin.jvm.internal.KotlinSyntheticClass")), b.SYNTHETIC_CLASS);
    }

    @Override // rm2.e0
    public final void a() {
    }

    @Override // rm2.e0
    public final c0 b(ym2.b bVar, fm2.a aVar) {
        b bVar2;
        ym2.c b13 = bVar.b();
        if (b13.equals(d0.f72701a)) {
            return new f(this);
        }
        int i13 = 0;
        if (b13.equals(d0.f72715o)) {
            return new g(this, i13, i13);
        }
        if (f113289i || this.f113297g != null || (bVar2 = (b) f113290j.get(bVar)) == null) {
            return null;
        }
        this.f113297g = bVar2;
        return new g(this, 1, i13);
    }
}
