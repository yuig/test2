package l62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81620a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f81621b;

    public b(a0 a0Var) {
        this.f81620a = 1;
        this.f81621b = a0Var;
    }

    public final void a(Integer num, String id3) {
        int i13 = this.f81620a;
        Object obj = this.f81621b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(id3, "id");
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((b) ((c) it.next())).a(num, id3);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(id3, "id");
                ((a0) obj).f81618d.invoke(new t(id3, num));
                break;
        }
    }

    public final void b(int i13, String id3) {
        switch (this.f81620a) {
            case 0:
                Intrinsics.checkNotNullParameter(id3, "id");
                Iterator it = ((List) this.f81621b).iterator();
                while (it.hasNext()) {
                    ((b) ((c) it.next())).b(i13, id3);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(id3, "id");
                break;
        }
    }

    public final void c(String id3) {
        int i13 = this.f81620a;
        Object obj = this.f81621b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(id3, "id");
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((b) ((c) it.next())).c(id3);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(id3, "id");
                ((a0) obj).f81618d.invoke(new i(id3));
                break;
        }
    }

    public final void d(String id3) {
        int i13 = this.f81620a;
        Object obj = this.f81621b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(id3, "id");
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((b) ((c) it.next())).d(id3);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(id3, "id");
                ((a0) obj).f81618d.invoke(new j(id3));
                break;
        }
    }

    public final void e(String id3) {
        int i13 = this.f81620a;
        Object obj = this.f81621b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(id3, "id");
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((b) ((c) it.next())).e(id3);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(id3, "id");
                ((a0) obj).f81618d.invoke(new k(id3));
                break;
        }
    }

    public final void f(String id3) {
        int i13 = this.f81620a;
        Object obj = this.f81621b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(id3, "id");
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((b) ((c) it.next())).f(id3);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(id3, "id");
                ((a0) obj).f81618d.invoke(new s(id3));
                break;
        }
    }

    public b() {
        this.f81620a = 0;
        this.f81621b = new ArrayList();
    }
}
