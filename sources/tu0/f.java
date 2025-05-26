package tu0;

import com.pinterest.feature.ideaPinCreation.education.IdeaPinCreationEducationOnboardingView;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationEducationOnboardingView f119332a;

    public f(IdeaPinCreationEducationOnboardingView ideaPinCreationEducationOnboardingView) {
        this.f119332a = ideaPinCreationEducationOnboardingView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f119332a.invalidate();
    }
}
