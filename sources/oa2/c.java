package oa2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes4.dex */
public class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f93854a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f93855b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f93856c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f93857d;

    public c(Function0 userIdProvider, Function1 userNavigator, Function0 actionButtonAction, Function0 optionsButtonAction) {
        Intrinsics.checkNotNullParameter(userIdProvider, "userIdProvider");
        Intrinsics.checkNotNullParameter(userNavigator, "userNavigator");
        Intrinsics.checkNotNullParameter(actionButtonAction, "actionButtonAction");
        Intrinsics.checkNotNullParameter(optionsButtonAction, "optionsButtonAction");
        this.f93854a = userIdProvider;
        this.f93855b = userNavigator;
        this.f93856c = actionButtonAction;
        this.f93857d = optionsButtonAction;
    }

    public final void a() {
        String str = (String) this.f93854a.invoke();
        if (!z.j(str)) {
            this.f93855b.invoke(str);
        }
    }

    @Override // oa2.l
    public void k() {
        this.f93856c.invoke();
    }

    public /* synthetic */ c(Function0 function0, Function1 function1, m mVar, int i13) {
        this(function0, function1, (i13 & 4) != 0 ? b.f93849j : mVar, b.f93850k);
    }
}
