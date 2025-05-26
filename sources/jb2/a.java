package jb2;

import android.content.res.TypedArray;
import com.google.firebase.messaging.q;
import com.pinterest.ui.view.descriptors.VisualSearchPill;
import im1.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;
import u50.o;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75352i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ VisualSearchPill f75353j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(VisualSearchPill visualSearchPill, int i13) {
        super(1);
        this.f75352i = i13;
        this.f75353j = visualSearchPill;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f75352i;
        VisualSearchPill visualSearchPill = this.f75353j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return new h(((b) ((o) visualSearchPill.f52730a.f33803a)).f75362i);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new i(((b) ((o) visualSearchPill.f52730a.f33803a)).f75362i);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f75352i;
        VisualSearchPill visualSearchPill = this.f75353j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = VisualSearchPill.f52728f;
                visualSearchPill.getClass();
                String string = $receiver.getString(vc2.g.VisualSearchPill_android_text);
                if (string == null) {
                    string = "";
                }
                f0 h23 = bs1.c.h2(string);
                String string2 = $receiver.getString(vc2.g.VisualSearchPill_android_contentDescription);
                break;
            case 1:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar2 = VisualSearchPill.f52728f;
                visualSearchPill.c(it);
                break;
            case 2:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                fm1.c cVar3 = VisualSearchPill.f52728f;
                visualSearchPill.getClass();
                a aVar = new a(visualSearchPill, 3);
                q qVar = visualSearchPill.f52730a;
                qVar.F(m.f72668n, aVar);
                qVar.I(m.f72670p, new a(visualSearchPill, 4));
                break;
        }
        return b((Unit) obj);
    }
}
