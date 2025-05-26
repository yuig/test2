package hh1;

import android.content.Context;
import android.view.View;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import we1.n1;

/* loaded from: classes5.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69163a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltIcon f69164b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f69165c;

    /* renamed from: d, reason: collision with root package name */
    public View f69166d;

    public /* synthetic */ f(int i13) {
        this.f69163a = i13;
    }

    @Override // hh1.s
    public final View a(Context context) {
        switch (this.f69163a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                View inflate = View.inflate(context, p92.c.view_idea_pin_tooltip_at_mention, null);
                View findViewById = inflate.findViewById(p92.b.at_mention_user_name);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                this.f69165c = (GestaltText) findViewById;
                View findViewById2 = inflate.findViewById(p92.b.at_mention_avatar);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                this.f69166d = (GestaltAvatar) findViewById2;
                View findViewById3 = inflate.findViewById(p92.b.at_mention_arrow);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                this.f69164b = (GestaltIcon) findViewById3;
                Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
                return inflate;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                View inflate2 = View.inflate(context, p92.c.view_idea_pin_tooltip_board_sticker, null);
                View findViewById4 = inflate2.findViewById(p92.b.arrow);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                this.f69164b = (GestaltIcon) findViewById4;
                View findViewById5 = inflate2.findViewById(p92.b.board_sticker_tooltip_board_count);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                this.f69165c = (GestaltText) findViewById5;
                View findViewById6 = inflate2.findViewById(p92.b.board_sticker_tooltip_primary_text);
                Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
                this.f69166d = (GestaltText) findViewById6;
                Intrinsics.checkNotNullExpressionValue(inflate2, "apply(...)");
                return inflate2;
        }
    }

    @Override // hh1.s
    public final void b(l lVar) {
        switch (this.f69163a) {
            case 0:
                n data = (n) lVar;
                Intrinsics.checkNotNullParameter(data, "data");
                String str = data.f69194h;
                if (str != null) {
                    GestaltText gestaltText = this.f69165c;
                    if (gestaltText == null) {
                        Intrinsics.r("username");
                        throw null;
                    }
                    gestaltText.i(new e(str, data, 0));
                    GestaltAvatar gestaltAvatar = (GestaltAvatar) this.f69166d;
                    if (gestaltAvatar == null) {
                        Intrinsics.r("avatar");
                        throw null;
                    }
                    gestaltAvatar.H2(new e(str, data, 1));
                }
                String str2 = data.f69195i;
                if (str2 != null) {
                    GestaltAvatar gestaltAvatar2 = (GestaltAvatar) this.f69166d;
                    if (gestaltAvatar2 == null) {
                        Intrinsics.r("avatar");
                        throw null;
                    }
                    gestaltAvatar2.H2(new e(str2, data, 2));
                }
                Integer num = data.f69197k;
                if (num != null) {
                    int intValue = num.intValue();
                    GestaltAvatar gestaltAvatar3 = (GestaltAvatar) this.f69166d;
                    if (gestaltAvatar3 == null) {
                        Intrinsics.r("avatar");
                        throw null;
                    }
                    gestaltAvatar3.setForeground(bs1.c.f0(gestaltAvatar3, intValue, null, null, 6));
                }
                GestaltIcon gestaltIcon = this.f69164b;
                if (gestaltIcon != null) {
                    gestaltIcon.g2(new n1(data, 17));
                    return;
                } else {
                    Intrinsics.r("arrow");
                    throw null;
                }
            default:
                o data2 = (o) lVar;
                Intrinsics.checkNotNullParameter(data2, "data");
                String str3 = data2.f69201h;
                if (str3 != null) {
                    GestaltText gestaltText2 = (GestaltText) this.f69166d;
                    if (gestaltText2 == null) {
                        Intrinsics.r("primaryText");
                        throw null;
                    }
                    gestaltText2.i(new ic1.c(23, str3, data2));
                }
                if (data2.f69202i != null) {
                    GestaltText gestaltText3 = this.f69165c;
                    if (gestaltText3 == null) {
                        Intrinsics.r("boardCount");
                        throw null;
                    }
                    gestaltText3.i(new ic1.c(24, this, data2));
                } else {
                    GestaltText gestaltText4 = this.f69165c;
                    if (gestaltText4 == null) {
                        Intrinsics.r("boardCount");
                        throw null;
                    }
                    a0.k0(gestaltText4);
                }
                GestaltIcon gestaltIcon2 = this.f69164b;
                if (gestaltIcon2 != null) {
                    gestaltIcon2.g2(new n1(data2, 18));
                    return;
                } else {
                    Intrinsics.r("arrow");
                    throw null;
                }
        }
    }
}
