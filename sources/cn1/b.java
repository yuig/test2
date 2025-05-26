package cn1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchField f28134j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GestaltSearchField gestaltSearchField, int i13) {
        super(1);
        this.f28133i = i13;
        this.f28134j = gestaltSearchField;
    }

    public final void b(u50.i0 it) {
        int i13 = this.f28133i;
        GestaltSearchField gestaltSearchField = this.f28134j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = gestaltSearchField.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String obj = it.a(context).toString();
                if (gestaltSearchField.f49515j == null && obj.length() > 0) {
                    int i14 = f0.gestalt_searchfield_label;
                    Context context2 = gestaltSearchField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
                    pp2.a.k(gestaltText, new zx0.d(i14, 29));
                    gestaltSearchField.f49515j = gestaltText;
                    gestaltSearchField.addView(gestaltText);
                    androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
                    pVar.j(gestaltSearchField);
                    pVar.l(i14, 3, gestaltSearchField.getId(), 3);
                    pVar.l(i14, 6, gestaltSearchField.getId(), 6);
                    pVar.m(gestaltSearchField.S0().getId(), 3, i14, 4, gestaltSearchField.f49509d);
                    pVar.b(gestaltSearchField);
                }
                GestaltText gestaltText2 = gestaltSearchField.f49515j;
                if (gestaltText2 != null) {
                    gestaltSearchField.L(gestaltText2.i(new k(gestaltSearchField, obj)));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "helperText");
                Context context3 = gestaltSearchField.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                gestaltSearchField.k0(it.a(context3).toString(), vn1.c.SUBTLE, null);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f fVar;
        f fVar2;
        ArrayList arrayList;
        List split$default;
        int i13 = 6;
        int i14 = this.f28133i;
        GestaltSearchField gestaltSearchField = this.f28134j;
        switch (i14) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                rm1.i iVar = GestaltSearchField.f49499t;
                gestaltSearchField.getClass();
                u50.i0 c13 = u50.g0.c($receiver, j0.GestaltSearchField_android_text);
                u50.i0 c14 = u50.g0.c($receiver, j0.GestaltSearchField_gestalt_searchfieldLabelText);
                u50.i0 c15 = u50.g0.c($receiver, j0.GestaltSearchField_gestalt_searchfieldHelperText);
                u50.i0 c16 = u50.g0.c($receiver, j0.GestaltSearchField_android_hint);
                rm1.q b13 = rm1.r.b($receiver, j0.GestaltSearchField_gestalt_searchfieldLeadingIcon);
                rm1.q b14 = rm1.r.b($receiver, j0.GestaltSearchField_gestalt_searchfieldTrailingIcon);
                if (b14 != null) {
                    String string = $receiver.getString(j0.GestaltSearchField_gestalt_searchfieldTrailingIconContDesc);
                    fVar = string != null ? new f(bs1.c.h2(string), b14) : null;
                } else {
                    fVar = null;
                }
                rm1.q b15 = rm1.r.b($receiver, j0.GestaltSearchField_gestalt_searchfieldLeftTrailingIcon);
                if (b15 != null) {
                    String string2 = $receiver.getString(j0.GestaltSearchField_gestalt_searchfieldLeftTrailingIconContDesc);
                    fVar2 = string2 != null ? new f(u50.g0.a(string2), b15) : null;
                } else {
                    fVar2 = null;
                }
                Integer b16 = dl2.b.b1($receiver, j0.GestaltSearchField_gestalt_searchfieldTrailingAnimatedIcon);
                e eVar = b16 != null ? new e(b16.intValue(), u50.g0.c($receiver, j0.GestaltSearchField_gestalt_searchfieldTrailingAnimatedIconContDesc)) : null;
                c Q = kh2.j.Q($receiver);
                g W = kh2.j.W($receiver);
                c O = kh2.j.O($receiver);
                c P = kh2.j.P($receiver);
                int i15 = $receiver.getInt(j0.GestaltSearchField_gestalt_searchfieldVariant, -1);
                dn1.e eVar2 = i15 >= 0 ? dn1.e.values()[i15] : GestaltSearchField.f49502w;
                String string3 = $receiver.getString(j0.GestaltSearchField_android_autofillHints);
                if (string3 != null) {
                    split$default = StringsKt__StringsKt.split$default(string3, new String[]{","}, false, 0, 6, null);
                    List list = split$default;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(StringsKt.i0((String) it.next()).toString());
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return new d(c13, c14, c15, c16, b13, fVar, fVar2, eVar, Q, W, eVar2, arrayList, dl2.b.L0($receiver, j0.GestaltSearchField_android_imeOptions), dl2.b.N0($receiver, j0.GestaltSearchField_android_inputType), d7.b.Y($receiver, j0.GestaltSearchField_android_visibility, GestaltSearchField.f49503x), O, P, gestaltSearchField.getId(), $receiver.getBoolean(j0.GestaltSearchField_gestalt_searchfieldHasErrorState, false));
            case 1:
                gm1.a it2 = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                rm1.i iVar2 = GestaltSearchField.f49499t;
                SearchView searchView = gestaltSearchField.S0();
                b doOnQueryTextChange = new b(gestaltSearchField, 4);
                b makeQueryTextChangeEvent = new b(gestaltSearchField, 5);
                b makeQueryTextSubmitEvent = new b(gestaltSearchField, i13);
                im1.l doOnQueryTextSubmit = im1.l.f72662o;
                final com.google.firebase.messaging.q qVar = gestaltSearchField.f49506a;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(searchView, "searchView");
                Intrinsics.checkNotNullParameter(doOnQueryTextChange, "doOnQueryTextChange");
                Intrinsics.checkNotNullParameter(makeQueryTextChangeEvent, "makeQueryTextChangeEvent");
                Intrinsics.checkNotNullParameter(doOnQueryTextSubmit, "doOnQueryTextSubmit");
                Intrinsics.checkNotNullParameter(makeQueryTextSubmitEvent, "makeQueryTextSubmitEvent");
                searchView.G = new im1.n(doOnQueryTextSubmit, qVar, makeQueryTextSubmitEvent, doOnQueryTextChange, makeQueryTextChangeEvent);
                SearchView searchView2 = gestaltSearchField.S0();
                final b doOnFocusChange = new b(gestaltSearchField, 7);
                final b makeFocusChangeEvent = new b(gestaltSearchField, 8);
                Intrinsics.checkNotNullParameter(searchView2, "searchView");
                Intrinsics.checkNotNullParameter(doOnFocusChange, "doOnFocusChange");
                Intrinsics.checkNotNullParameter(makeFocusChangeEvent, "makeFocusChangeEvent");
                searchView2.H = new View.OnFocusChangeListener(doOnFocusChange) { // from class: im1.e

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Function1 f72636a;

                    {
                        this.f72636a = doOnFocusChange;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z13) {
                        Function1 doOnFocusChange2 = this.f72636a;
                        Intrinsics.checkNotNullParameter(doOnFocusChange2, "$doOnFocusChange");
                        q this$0 = qVar;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Function1 makeFocusChangeEvent2 = makeFocusChangeEvent;
                        Intrinsics.checkNotNullParameter(makeFocusChangeEvent2, "$makeFocusChangeEvent");
                        doOnFocusChange2.invoke(Boolean.valueOf(z13));
                        this$0.s((gm1.c) makeFocusChangeEvent2.invoke(Boolean.valueOf(z13)));
                    }
                };
                GestaltIconButton gestaltIconButton = gestaltSearchField.f49511f;
                if (gestaltIconButton != null) {
                    gestaltIconButton.u(it2);
                }
                GestaltButton gestaltButton = gestaltSearchField.f49512g;
                if (gestaltButton != null) {
                    gestaltButton.e(it2);
                }
                GestaltIconButton gestaltIconButton2 = gestaltSearchField.f49513h;
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.u(it2);
                }
                GestaltIconButton gestaltIconButton3 = gestaltSearchField.f49514i;
                if (gestaltIconButton3 != null) {
                    gestaltIconButton3.u(it2);
                }
                return Unit.f80348a;
            case 2:
                b((u50.i0) obj);
                return Unit.f80348a;
            case 3:
                b((u50.i0) obj);
                return Unit.f80348a;
            case 4:
                rm1.i iVar3 = GestaltSearchField.f49499t;
                gestaltSearchField.r0((String) obj);
                return Unit.f80348a;
            case 5:
                String str = (String) obj;
                switch (i14) {
                    case 5:
                        return new q(gestaltSearchField.getId(), str);
                    default:
                        return new r(gestaltSearchField.getId(), str);
                }
            case 6:
                String str2 = (String) obj;
                switch (i14) {
                    case 5:
                        return new q(gestaltSearchField.getId(), str2);
                    default:
                        return new r(gestaltSearchField.getId(), str2);
                }
            case 7:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rm1.i iVar4 = GestaltSearchField.f49499t;
                if (!gestaltSearchField.G0().f28170s) {
                    if (booleanValue) {
                        gestaltSearchField.S0().setBackgroundResource(e0.searchfield_bg_focused);
                    } else {
                        gestaltSearchField.b1();
                        gestaltSearchField.T0(true);
                    }
                }
                rm1.q qVar2 = gestaltSearchField.G0().f28156e;
                if (qVar2 == null) {
                    qVar2 = GestaltSearchField.f49500u;
                }
                gestaltSearchField.o0(qVar2, booleanValue);
                return Unit.f80348a;
            default:
                return new o(gestaltSearchField.getId(), ((Boolean) obj).booleanValue());
        }
    }
}
