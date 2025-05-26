package fc0;

import b4.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f61677a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f61678b;

    /* renamed from: c, reason: collision with root package name */
    public final mc0.a f61679c;

    public a() {
        q0 textTextFieldStyle = c.f61689f;
        q0 headerTextStyle = c.f61691h;
        q0 actionButtonLabelStyle = c.f61686c;
        q0 buttonTextStyle = c.f61690g;
        cc0.a baseUrlStyles = new cc0.a(c.f61687d, c.f61685b);
        q0 q0Var = c.f61684a;
        lc0.a selectListTextStyle = new lc0.a(q0Var, buttonTextStyle, q0Var, q0Var);
        mc0.a textFieldTextStyle = new mc0.a(q0Var, c.f61688e, q0Var, q0Var, textTextFieldStyle);
        Intrinsics.checkNotNullParameter(textTextFieldStyle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(headerTextStyle, "boardRepSensitiveContentStyle");
        Intrinsics.checkNotNullParameter(actionButtonLabelStyle, "actionButtonLabelStyle");
        Intrinsics.checkNotNullParameter(buttonTextStyle, "buttonTextStyle");
        Intrinsics.checkNotNullParameter(textTextFieldStyle, "textTextFieldStyle");
        Intrinsics.checkNotNullParameter(headerTextStyle, "tabTextStyle");
        Intrinsics.checkNotNullParameter(baseUrlStyles, "baseUrlStyles");
        Intrinsics.checkNotNullParameter(headerTextStyle, "headerTextStyle");
        Intrinsics.checkNotNullParameter(selectListTextStyle, "selectListTextStyle");
        Intrinsics.checkNotNullParameter(textFieldTextStyle, "textFieldTextStyle");
        this.f61677a = textTextFieldStyle;
        this.f61678b = actionButtonLabelStyle;
        this.f61679c = textFieldTextStyle;
    }
}
