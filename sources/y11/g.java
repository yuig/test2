package y11;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataEditText;
import com.pinterest.feature.pin.edit.view.AttributeBasicsListView;
import h32.g0;
import jc0.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import up0.l;
import x02.l2;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136645i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AttributeBasicsListView f136646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AttributeBasicsListView attributeBasicsListView, int i13) {
        super(1);
        this.f136645i = i13;
        this.f136646j = attributeBasicsListView;
    }

    public final void b(Boolean bool) {
        int i13 = this.f136645i;
        AttributeBasicsListView attributeBasicsListView = this.f136646j;
        switch (i13) {
            case 0:
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    int i14 = AttributeBasicsListView.f47170r;
                    w wVar = attributeBasicsListView.f47179l;
                    if (wVar == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    MetadataEditText metadataEditText = attributeBasicsListView.f47173f;
                    Editable text = metadataEditText.getText();
                    Intrinsics.g(text, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) text;
                    int selectionStart = metadataEditText.getSelectionStart();
                    l j13 = attributeBasicsListView.j();
                    l2 l2Var = attributeBasicsListView.f47176i;
                    if (l2Var == null) {
                        Intrinsics.r("typeaheadRepository");
                        throw null;
                    }
                    uk1.e eVar = attributeBasicsListView.f47177j;
                    if (eVar != null) {
                        wVar.d(new v(new zp0.b(spannableStringBuilder, selectionStart, j13, l2Var, eVar, attributeBasicsListView.i(), wp0.f.StoryPinCreate, attributeBasicsListView, (Boolean) null, (g0) null, 1792), false, 0L, 30));
                        return;
                    } else {
                        Intrinsics.r("presenterPinalyticsFactory");
                        throw null;
                    }
                }
                return;
            default:
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    int i15 = AttributeBasicsListView.f47170r;
                    w wVar2 = attributeBasicsListView.f47179l;
                    if (wVar2 == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    MetadataEditText metadataEditText2 = attributeBasicsListView.f47173f;
                    Editable text2 = metadataEditText2.getText();
                    Intrinsics.g(text2, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) text2;
                    int selectionStart2 = metadataEditText2.getSelectionStart();
                    l2 l2Var2 = attributeBasicsListView.f47176i;
                    if (l2Var2 == null) {
                        Intrinsics.r("typeaheadRepository");
                        throw null;
                    }
                    uk1.e eVar2 = attributeBasicsListView.f47177j;
                    if (eVar2 != null) {
                        wVar2.d(new v(new tp1.b(spannableStringBuilder2, selectionStart2, l2Var2, eVar2, attributeBasicsListView.i(), attributeBasicsListView), false, 0L, 30));
                        return;
                    } else {
                        Intrinsics.r("presenterPinalyticsFactory");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f136645i) {
            case 0:
                b((Boolean) obj);
                break;
            default:
                b((Boolean) obj);
                break;
        }
        return Unit.f80348a;
    }
}
