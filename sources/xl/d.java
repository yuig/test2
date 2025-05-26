package xl;

import com.google.firebase.encoders.EncodingException;
import java.util.Date;
import java.util.HashMap;
import vl.e;
import yl.i;

/* loaded from: classes3.dex */
public final class d implements wl.a {

    /* renamed from: c, reason: collision with root package name */
    public static final b f135243c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f135244d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f135245e = new c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f135246a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f135247b;

    /* JADX WARN: Type inference failed for: r0v1, types: [xl.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [xl.b] */
    static {
        final int i13 = 0;
        f135243c = new e() { // from class: xl.b
            @Override // vl.a
            public final void a(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        String str = (String) obj;
                        i iVar = (i) obj2;
                        if (iVar.f139285a) {
                            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                        }
                        iVar.f139285a = true;
                        iVar.f139288d.d(iVar.f139287c, str, iVar.f139286b);
                        return;
                    default:
                        i iVar2 = (i) obj2;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (iVar2.f139285a) {
                            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                        }
                        iVar2.f139285a = true;
                        iVar2.f139288d.b(iVar2.f139287c, booleanValue ? 1 : 0, iVar2.f139286b);
                        return;
                }
            }
        };
        final int i14 = 1;
        f135244d = new e() { // from class: xl.b
            @Override // vl.a
            public final void a(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        String str = (String) obj;
                        i iVar = (i) obj2;
                        if (iVar.f139285a) {
                            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                        }
                        iVar.f139285a = true;
                        iVar.f139288d.d(iVar.f139287c, str, iVar.f139286b);
                        return;
                    default:
                        i iVar2 = (i) obj2;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (iVar2.f139285a) {
                            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                        }
                        iVar2.f139285a = true;
                        iVar2.f139288d.b(iVar2.f139287c, booleanValue ? 1 : 0, iVar2.f139286b);
                        return;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f135246a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f135247b = hashMap2;
        hashMap2.put(String.class, f135243c);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f135244d);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f135245e);
        hashMap.remove(Date.class);
    }

    public final wl.a a(Class cls, vl.c cVar) {
        this.f135246a.put(cls, cVar);
        this.f135247b.remove(cls);
        return this;
    }
}
