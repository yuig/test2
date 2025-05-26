package wn1;

import android.content.res.TypedArray;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130508i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextComposer f130509j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, GestaltTextComposer gestaltTextComposer) {
        super(1);
        this.f130508i = i13;
        this.f130509j = gestaltTextComposer;
    }

    public final void b(om1.c cVar) {
        int i13 = this.f130508i;
        GestaltTextComposer gestaltTextComposer = this.f130509j;
        switch (i13) {
            case 3:
                if (cVar != null) {
                    Object value = gestaltTextComposer.f49662n.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    GestaltTextComposer.L(gestaltTextComposer, (GestaltIcon) value, cVar);
                    break;
                }
                break;
            default:
                if (cVar != null) {
                    Object value2 = gestaltTextComposer.f49664p.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    GestaltTextComposer.L(gestaltTextComposer, (GestaltIcon) value2, cVar);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130508i;
        final int i14 = 1;
        final int i15 = 0;
        final GestaltTextComposer gestaltTextComposer = this.f130509j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                ImageView.ScaleType scaleType = GestaltTextComposer.f49648u;
                gestaltTextComposer.getClass();
                String string = $receiver.getString(g0.GestaltTextComposer_android_text);
                u50.f0 h23 = string != null ? bs1.c.h2(string) : null;
                String string2 = $receiver.getString(g0.GestaltTextComposer_android_hint);
                u50.f0 h24 = string2 != null ? bs1.c.h2(string2) : null;
                boolean z13 = $receiver.getBoolean(g0.GestaltTextComposer_android_singleLine, true);
                int integer = $receiver.getInteger(g0.GestaltTextComposer_android_minLines, 3);
                int integer2 = $receiver.getInteger(g0.GestaltTextComposer_android_maxLines, 0);
                int integer3 = $receiver.getInteger(g0.GestaltTextComposer_android_maxLength, 0);
                boolean z14 = $receiver.getBoolean(g0.GestaltTextComposer_gestalt_textcomposer_hasMaxLengthLimit, false);
                boolean z15 = $receiver.getBoolean(g0.GestaltTextComposer_gestalt_textcomposer_isMediaRemovable, true);
                int i16 = $receiver.getInt(g0.GestaltTextComposer_gestalt_textcomposer_mediaScaleType, -1);
                ImageView.ScaleType scaleType2 = i16 >= 0 ? ImageView.ScaleType.values()[i16] : GestaltTextComposer.f49648u;
                int integer4 = $receiver.getInteger(g0.GestaltTextComposer_gestalt_textcomposer_mediaCornerRadii, GestaltTextComposer.f49649v);
                boolean z16 = $receiver.getBoolean(g0.GestaltTextComposer_android_enabled, true);
                int i17 = $receiver.getInt(g0.GestaltTextComposer_gestalt_textcomposer_variant, -1);
                f fVar = i17 >= 0 ? f.values()[i17] : GestaltTextComposer.f49650w;
                fm1.c Y = d7.b.Y($receiver, g0.GestaltTextComposer_android_visibility, GestaltTextComposer.f49651x);
                int integer5 = $receiver.getInteger(g0.GestaltTextComposer_gestalt_textcomposer_cursorIndex, -1);
                Integer valueOf = integer5 >= 0 ? Integer.valueOf(integer5) : null;
                List L0 = dl2.b.L0($receiver, g0.GestaltTextComposer_android_imeOptions);
                List N0 = dl2.b.N0($receiver, g0.GestaltTextComposer_android_inputType);
                boolean z17 = $receiver.getBoolean(g0.GestaltTextComposer_gestalt_textcomposer_supportLinks, false);
                om1.c r03 = GestaltTextComposer.r0($receiver, g0.GestaltTextComposer_gestalt_textComposerPrimaryIcon, g0.GestaltTextComposer_gestalt_textComposerPrimarySize, g0.GestaltTextComposer_gestalt_textComposerPrimaryStyle, g0.GestaltTextComposer_gestalt_textComposerPrimaryVisibility, g0.GestaltTextComposer_gestalt_textComposerPrimaryContentDescription, g0.GestaltTextComposer_gestalt_textComposerPrimaryStyleEnabled, c0.primary_button);
                om1.c r04 = GestaltTextComposer.r0($receiver, g0.GestaltTextComposer_gestalt_textComposerSecondaryIcon, 1, 0, g0.GestaltTextComposer_gestalt_textComposerSecondaryVisibility, g0.GestaltTextComposer_gestalt_textComposerSecondaryContentDescription, g0.GestaltTextComposer_gestalt_textComposerSecondaryStyleEnabled, c0.secondary_button);
                om1.c r05 = GestaltTextComposer.r0($receiver, g0.GestaltTextComposer_gestalt_textComposerTertiaryIcon, 1, 0, g0.GestaltTextComposer_gestalt_textComposerTertiaryVisibility, g0.GestaltTextComposer_gestalt_textComposerTertiaryContentDescription, g0.GestaltTextComposer_gestalt_textComposerTertiaryStyleEnabled, c0.tertiary_button);
                int id3 = gestaltTextComposer.getId();
                Intrinsics.f(scaleType2);
                return new d(h23, h24, fVar, z13, integer, integer2, integer3, z14, null, null, z15, scaleType2, integer4, z16, Y, valueOf, L0, N0, z17, r03, r04, r05, id3);
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ImageView.ScaleType scaleType3 = GestaltTextComposer.f49648u;
                Object value = gestaltTextComposer.f49654f.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((WebImageView) value).setOnClickListener(new View.OnClickListener() { // from class: wn1.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i18 = i15;
                        GestaltTextComposer this$0 = gestaltTextComposer;
                        switch (i18) {
                            case 0:
                                ImageView.ScaleType scaleType4 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f49652d.s(new s(this$0.getId()));
                                break;
                            case 1:
                                ImageView.ScaleType scaleType5 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                om1.c cVar = this$0.k0().f130534u;
                                if (cVar != null && cVar.f96644f) {
                                    this$0.f49652d.s(new w(this$0.getId()));
                                    break;
                                }
                                break;
                            default:
                                ImageView.ScaleType scaleType6 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                om1.c cVar2 = this$0.k0().f130535v;
                                if (cVar2 != null && cVar2.f96644f) {
                                    this$0.f49652d.s(new x(this$0.getId()));
                                    break;
                                }
                                break;
                        }
                    }
                });
                Object value2 = gestaltTextComposer.f49655g.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((GestaltIconButton) value2).u(new gm1.a() { // from class: wn1.b
                    @Override // gm1.a
                    public final void h3(gm1.c it2) {
                        int i18 = i15;
                        GestaltTextComposer this$0 = gestaltTextComposer;
                        switch (i18) {
                            case 0:
                                ImageView.ScaleType scaleType4 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it2, "it");
                                if (it2 instanceof om1.l) {
                                    this$0.X(h.C);
                                    this$0.f49652d.s(new t(this$0.getId()));
                                    break;
                                }
                                break;
                            default:
                                ImageView.ScaleType scaleType5 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it2, "it");
                                if (it2 instanceof om1.l) {
                                    this$0.f49652d.s(new v(this$0.getId()));
                                    break;
                                }
                                break;
                        }
                    }
                });
                gestaltTextComposer.f49652d.J(false, gestaltTextComposer.o0(), new mm1.g(gestaltTextComposer, i14), new l(i15, gestaltTextComposer), new l(i14, gestaltTextComposer), new c(5, gestaltTextComposer));
                TextInputEditText o03 = gestaltTextComposer.o0();
                c cVar = new c(6, gestaltTextComposer);
                com.google.firebase.messaging.q qVar = gestaltTextComposer.f49652d;
                com.google.firebase.messaging.q.H(qVar, false, o03, cVar, 5);
                com.google.firebase.messaging.q.A(qVar, false, gestaltTextComposer.o0(), new c(7, gestaltTextComposer), 5);
                TextInputEditText editText = gestaltTextComposer.o0();
                k makeEditorActionEvent = new k(i14, gestaltTextComposer);
                qVar.getClass();
                Intrinsics.checkNotNullParameter(editText, "editText");
                Intrinsics.checkNotNullParameter(makeEditorActionEvent, "makeEditorActionEvent");
                editText.setOnEditorActionListener(new im1.k(qVar, makeEditorActionEvent));
                TextInputEditText editText2 = gestaltTextComposer.o0();
                k makeKeyEvent = new k(i15, gestaltTextComposer);
                qVar.getClass();
                Intrinsics.checkNotNullParameter(editText2, "editText");
                Intrinsics.checkNotNullParameter(makeKeyEvent, "makeKeyEvent");
                editText2.setOnKeyListener(new im1.h(qVar, makeKeyEvent));
                Object value3 = gestaltTextComposer.f49660l.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((GestaltIconButton) value3).u(new gm1.a() { // from class: wn1.b
                    @Override // gm1.a
                    public final void h3(gm1.c it2) {
                        int i18 = i14;
                        GestaltTextComposer this$0 = gestaltTextComposer;
                        switch (i18) {
                            case 0:
                                ImageView.ScaleType scaleType4 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it2, "it");
                                if (it2 instanceof om1.l) {
                                    this$0.X(h.C);
                                    this$0.f49652d.s(new t(this$0.getId()));
                                    break;
                                }
                                break;
                            default:
                                ImageView.ScaleType scaleType5 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it2, "it");
                                if (it2 instanceof om1.l) {
                                    this$0.f49652d.s(new v(this$0.getId()));
                                    break;
                                }
                                break;
                        }
                    }
                });
                Object value4 = gestaltTextComposer.f49661m.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((FrameLayout) value4).setOnClickListener(new View.OnClickListener() { // from class: wn1.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i18 = i14;
                        GestaltTextComposer this$0 = gestaltTextComposer;
                        switch (i18) {
                            case 0:
                                ImageView.ScaleType scaleType4 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f49652d.s(new s(this$0.getId()));
                                break;
                            case 1:
                                ImageView.ScaleType scaleType5 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                om1.c cVar2 = this$0.k0().f130534u;
                                if (cVar2 != null && cVar2.f96644f) {
                                    this$0.f49652d.s(new w(this$0.getId()));
                                    break;
                                }
                                break;
                            default:
                                ImageView.ScaleType scaleType6 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                om1.c cVar22 = this$0.k0().f130535v;
                                if (cVar22 != null && cVar22.f96644f) {
                                    this$0.f49652d.s(new x(this$0.getId()));
                                    break;
                                }
                                break;
                        }
                    }
                });
                Object value5 = gestaltTextComposer.f49663o.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                final int i18 = 2;
                ((FrameLayout) value5).setOnClickListener(new View.OnClickListener() { // from class: wn1.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i182 = i18;
                        GestaltTextComposer this$0 = gestaltTextComposer;
                        switch (i182) {
                            case 0:
                                ImageView.ScaleType scaleType4 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f49652d.s(new s(this$0.getId()));
                                break;
                            case 1:
                                ImageView.ScaleType scaleType5 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                om1.c cVar2 = this$0.k0().f130534u;
                                if (cVar2 != null && cVar2.f96644f) {
                                    this$0.f49652d.s(new w(this$0.getId()));
                                    break;
                                }
                                break;
                            default:
                                ImageView.ScaleType scaleType6 = GestaltTextComposer.f49648u;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                om1.c cVar22 = this$0.k0().f130535v;
                                if (cVar22 != null && cVar22.f96644f) {
                                    this$0.f49652d.s(new x(this$0.getId()));
                                    break;
                                }
                                break;
                        }
                    }
                });
                return Unit.f80348a;
            case 2:
                ImageView.ScaleType scaleType4 = GestaltTextComposer.f49648u;
                Integer num = gestaltTextComposer.k0().f130529p;
                if (num != null) {
                    gestaltTextComposer.o0().setSelection(num.intValue());
                }
                return Unit.f80348a;
            case 3:
                b((om1.c) obj);
                return Unit.f80348a;
            case 4:
                b((om1.c) obj);
                return Unit.f80348a;
            case 5:
                return new n(gestaltTextComposer.getId(), (Editable) obj);
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gestaltTextComposer.f49668t = booleanValue;
                GestaltTextComposer.T(gestaltTextComposer, gestaltTextComposer.k0().f130516c);
                return new r(gestaltTextComposer.getId(), booleanValue);
            default:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new p(gestaltTextComposer.getId());
        }
    }
}
