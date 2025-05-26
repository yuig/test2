package sn1;

import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import q5.h0;
import q5.v0;
import tb.e;
import vn1.d;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113314i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f113315j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, int i13) {
        super(1);
        this.f113314i = i13;
        this.f113315j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f113314i;
        e eVar = this.f113315j;
        switch (i13) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                AppCompatTextView appCompatTextView = (AppCompatTextView) eVar.f116963a;
                WeakHashMap weakHashMap = v0.f102521a;
                new h0(b5.c.tag_accessibility_heading, 3).g(appCompatTextView, bool);
                break;
            case 1:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((AppCompatTextView) eVar.f116963a).setHyphenationFrequency(it.getFrequency$text_release());
                break;
            case 2:
                fm1.a it2 = (fm1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ((AppCompatTextView) eVar.f116963a).setImportantForAccessibility(it2.getImportantForAccessibility());
                break;
            case 3:
                fm1.b it3 = (fm1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ((AppCompatTextView) eVar.f116963a).setTextDirection(it3.getTextDirection());
                break;
            default:
                List it4 = (List) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                ((AppCompatTextView) eVar.f116963a).setGravity(((vn1.b) CollectionsKt.S(it4)).getGravity$text_release());
                if (it4.size() > 1) {
                    ((AppCompatTextView) eVar.f116963a).setGravity(((vn1.b) it4.get(1)).getGravity$text_release() | ((vn1.b) CollectionsKt.S(it4)).getGravity$text_release());
                }
                if (it4.contains(vn1.b.START)) {
                    ((AppCompatTextView) eVar.f116963a).setTextAlignment(5);
                } else if (it4.contains(vn1.b.END)) {
                    ((AppCompatTextView) eVar.f116963a).setTextAlignment(6);
                } else if (it4.contains(vn1.b.CENTER)) {
                    ((AppCompatTextView) eVar.f116963a).setTextAlignment(4);
                }
                break;
        }
        return Unit.f80348a;
    }
}
