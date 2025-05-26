package ao1;

import android.content.res.TypedArray;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import im1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import u5.x;
import u50.g0;
import u50.i0;
import xn1.p;
import yq0.c0;

/* loaded from: classes2.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20028i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextField f20029j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, GestaltTextField gestaltTextField) {
        super(1);
        this.f20028i = i13;
        this.f20029j = gestaltTextField;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        int i13 = this.f20028i;
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        GestaltTextField gestaltTextField = this.f20029j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                yn1.f fVar = GestaltTextField.f49669t;
                gestaltTextField.getClass();
                i0 c13 = g0.c($receiver, p.GestaltTextField_android_text);
                i0 c14 = g0.c($receiver, p.GestaltTextField_gestalt_textfield_labelText);
                i0 c15 = g0.c($receiver, p.GestaltTextField_gestalt_textfield_helperText);
                int i17 = $receiver.getInt(p.GestaltTextField_gestalt_textfield_helperTextLines, 2);
                i0 c16 = g0.c($receiver, p.GestaltTextField_android_hint);
                boolean z13 = $receiver.getBoolean(p.GestaltTextField_android_singleLine, true);
                int integer = $receiver.getInteger(p.GestaltTextField_android_minLines, 3);
                int integer2 = $receiver.getInteger(p.GestaltTextField_android_maxLines, 0);
                int integer3 = $receiver.getInteger(p.GestaltTextField_android_maxLength, 0);
                boolean z14 = $receiver.getBoolean(p.GestaltTextField_gestalt_textfield_limitTextToMaxLength, true);
                boolean z15 = $receiver.getBoolean(p.GestaltTextField_android_enabled, true);
                boolean z16 = $receiver.getBoolean(p.GestaltTextField_gestalt_textfield_isPassword, false);
                int i18 = $receiver.getInt(p.GestaltTextField_gestalt_textfield_variant, -1);
                yn1.f fVar2 = i18 >= 0 ? yn1.f.values()[i18] : GestaltTextField.f49669t;
                fm1.c Y = d7.b.Y($receiver, p.GestaltTextField_android_visibility, GestaltTextField.f49671v);
                boolean z17 = $receiver.getBoolean(p.GestaltTextField_gestalt_textfield_hasClearText, false);
                int integer4 = $receiver.getInteger(p.GestaltTextField_gestalt_textfield_cursorIndex, -1);
                ArrayList arrayList = null;
                Integer valueOf = integer4 < 0 ? null : Integer.valueOf(integer4);
                List L0 = dl2.b.L0($receiver, p.GestaltTextField_android_imeOptions);
                List N0 = dl2.b.N0($receiver, p.GestaltTextField_android_inputType);
                List N02 = dl2.b.N0($receiver, p.GestaltTextField_gestalt_textfield_rawInputType);
                String string = $receiver.getString(p.GestaltTextField_android_autofillHints);
                if (string != null) {
                    split$default = StringsKt__StringsKt.split$default(string, new String[]{","}, false, 0, 6, null);
                    List list = split$default;
                    arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StringsKt.i0((String) it.next()).toString());
                    }
                }
                return new b(c13, c14, c15, i17, c16, fVar2, z13, integer, integer2, integer3, z14, z15, z16, Y, z17, valueOf, L0, N0, N02, arrayList, $receiver.getBoolean(p.GestaltTextField_gestalt_textfield_supportLinks, false), gestaltTextField.getId());
            default:
                gm1.a it2 = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                yn1.f fVar3 = GestaltTextField.f49669t;
                TextInputEditText editText = gestaltTextField.o0();
                TextInputLayout inputLayout = gestaltTextField.r0();
                x xVar = gestaltTextField.f49673d;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(editText, "editText");
                Intrinsics.checkNotNullParameter(inputLayout, "inputLayout");
                boolean z18 = xVar.f120535a;
                if (!z18 || ((zn1.c) xVar.f120539e) == null) {
                    Object obj2 = xVar.f120538d;
                    if (z18) {
                        o b13 = xVar.b(true, editText);
                        c0 c17 = xVar.c(true, inputLayout);
                        fd1.e a13 = xVar.a(true, inputLayout);
                        q qVar = (q) obj2;
                        im1.b H = q.H(qVar, true, editText, new zn1.f(xVar, i15), 4);
                        im1.g A = q.A(qVar, true, editText, new zn1.f(xVar, i14), 4);
                        zn1.g makeEditorActionEvent = new zn1.g(xVar, i16);
                        Intrinsics.checkNotNullParameter(editText, "editText");
                        Intrinsics.checkNotNullParameter(makeEditorActionEvent, "makeEditorActionEvent");
                        im1.k kVar = new im1.k(qVar, makeEditorActionEvent);
                        zn1.g makeKeyEvent = new zn1.g(xVar, i15);
                        Intrinsics.checkNotNullParameter(editText, "editText");
                        Intrinsics.checkNotNullParameter(makeKeyEvent, "makeKeyEvent");
                        xVar.f120539e = new zn1.c(b13, c17, a13, H, A, kVar, new im1.h(qVar, makeKeyEvent));
                    } else {
                        xVar.b(false, editText);
                        xVar.c(false, inputLayout);
                        xVar.a(false, inputLayout);
                        q qVar2 = (q) obj2;
                        q.H(qVar2, false, editText, new zn1.h(xVar, i16), 5);
                        q.A(qVar2, false, editText, new zn1.h(xVar, i15), 5);
                        zn1.i makeEditorActionEvent2 = new zn1.i(xVar, i16);
                        Intrinsics.checkNotNullParameter(editText, "editText");
                        Intrinsics.checkNotNullParameter(makeEditorActionEvent2, "makeEditorActionEvent");
                        editText.setOnEditorActionListener(new im1.k(qVar2, makeEditorActionEvent2));
                        zn1.i makeKeyEvent2 = new zn1.i(xVar, i15);
                        Intrinsics.checkNotNullParameter(editText, "editText");
                        Intrinsics.checkNotNullParameter(makeKeyEvent2, "makeKeyEvent");
                        editText.setOnKeyListener(new im1.h(qVar2, makeKeyEvent2));
                    }
                }
                return Unit.f80348a;
        }
    }
}
