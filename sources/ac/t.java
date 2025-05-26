package ac;

import android.content.Context;
import android.graphics.Typeface;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.h f1883r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f1884s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1885t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1886u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, com.airbnb.lottie.h hVar, String str, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f1883r = hVar;
        this.f1884s = context;
        this.f1885t = str;
        this.f1886u = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new t(this.f1884s, this.f1883r, this.f1885t, this.f1886u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        for (cc.d dVar : this.f1883r.f28401f.values()) {
            Context context = this.f1884s;
            Intrinsics.f(dVar);
            String str = dVar.f27426c;
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), this.f1885t + dVar.f27424a + this.f1886u);
                try {
                    Intrinsics.f(createFromAsset);
                    Intrinsics.checkNotNullExpressionValue(str, "getStyle(...)");
                    int i13 = 0;
                    boolean E = StringsKt.E(str, "Italic", false);
                    boolean E2 = StringsKt.E(str, "Bold", false);
                    if (E && E2) {
                        i13 = 3;
                    } else if (E) {
                        i13 = 2;
                    } else if (E2) {
                        i13 = 1;
                    }
                    if (createFromAsset.getStyle() != i13) {
                        createFromAsset = Typeface.create(createFromAsset, i13);
                    }
                    dVar.f27427d = createFromAsset;
                } catch (Exception unused) {
                    jc.b.b();
                }
            } catch (Exception unused2) {
                jc.b.b();
            }
        }
        return Unit.f80348a;
    }
}
