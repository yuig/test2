package dq0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import so.oa;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f56087j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f56088k = new g(1);

    /* renamed from: l, reason: collision with root package name */
    public static final g f56089l = new g(2);

    /* renamed from: m, reason: collision with root package name */
    public static final g f56090m = new g(3);

    /* renamed from: n, reason: collision with root package name */
    public static final g f56091n = new g(4);

    /* renamed from: o, reason: collision with root package name */
    public static final g f56092o = new g(5);

    /* renamed from: p, reason: collision with root package name */
    public static final g f56093p = new g(6);

    /* renamed from: q, reason: collision with root package name */
    public static final g f56094q = new g(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56095i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f56095i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f56095i) {
            case 0:
                break;
            case 1:
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(th3.getLocalizedMessage());
                break;
            case 2:
                eq0.c.a(th3);
                break;
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                eq0.c.a(th3);
                break;
            default:
                eq0.c.a(th3);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f56095i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                b((Throwable) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            case 6:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
