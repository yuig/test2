package m5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f85845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f85846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f85847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f85848e;

    public /* synthetic */ d(String str, Context context, Object obj, int i13, int i14) {
        this.f85844a = i14;
        this.f85845b = str;
        this.f85846c = context;
        this.f85848e = obj;
        this.f85847d = i13;
    }

    public final e a() {
        int i13 = this.f85844a;
        int i14 = this.f85847d;
        Object obj = this.f85848e;
        Object obj2 = this.f85846c;
        String str = this.f85845b;
        switch (i13) {
            case 0:
                Object[] objArr = {(c) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                arrayList.add(obj3);
                return f.b(str, (Context) obj2, Collections.unmodifiableList(arrayList), i14);
            default:
                try {
                    return f.b(str, (Context) obj2, (List) obj, i14);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f85844a) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                Object obj = this.f85848e;
                ae0.e eVar = (ae0.e) obj;
                zd0.b bVar = eVar.f15048e;
                oa.i a13 = bVar.a();
                cw0.e contentType = (cw0.e) this.f85846c;
                eVar.f15046c.getClass();
                a13.c1(1, xa0.j.e(contentType));
                String str = this.f85845b;
                a13.c1(2, str);
                a13.u1(3, this.f85847d);
                a13.c1(4, str);
                Intrinsics.checkNotNullParameter(contentType, "contentType");
                a13.c1(5, contentType.getKey());
                try {
                    ((ae0.e) obj).f15044a.c();
                    try {
                        a13.G();
                        ((ae0.e) obj).f15044a.r();
                        bVar.j(a13);
                        return null;
                    } finally {
                        ((ae0.e) obj).f15044a.m();
                    }
                } catch (Throwable th3) {
                    bVar.j(a13);
                    throw th3;
                }
        }
    }

    public d(ae0.e eVar, cw0.e eVar2, String str) {
        this.f85844a = 2;
        this.f85848e = eVar;
        this.f85846c = eVar2;
        this.f85845b = str;
        this.f85847d = 15;
    }
}
