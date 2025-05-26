package s80;

import android.content.ActivityNotFoundException;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111873i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f111874j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.l f111875k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(Function1 function1, e.l lVar, int i13) {
        super(0);
        this.f111873i = i13;
        this.f111874j = function1;
        this.f111875k = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f111873i) {
            case 0:
                m257invoke();
                break;
            default:
                m257invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m257invoke() {
        o oVar = o.f111732a;
        h.b bVar = h.b.f66367a;
        h.c mediaType = h.c.f66368a;
        int i13 = this.f111873i;
        e.l lVar = this.f111875k;
        Function1 function1 = this.f111874j;
        switch (i13) {
            case 0:
                function1.invoke(oVar);
                try {
                    Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                    Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                    g.j jVar = new g.j();
                    jVar.f63182a = bVar;
                    Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                    jVar.f63182a = mediaType;
                    lVar.a(jVar);
                    break;
                } catch (ActivityNotFoundException unused) {
                    new Handler(Looper.getMainLooper()).post(new y2(0, function1));
                    return;
                }
            default:
                function1.invoke(oVar);
                Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                g.j jVar2 = new g.j();
                jVar2.f63182a = bVar;
                Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                jVar2.f63182a = mediaType;
                lVar.a(jVar2);
                break;
        }
    }
}
