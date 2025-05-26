package jc0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.component.modal.BaseModalViewWrapper;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class b implements a0 {
    public static final int $stable = 8;
    private View educationContainer;
    private View internalOverlay;
    private BaseModalViewWrapper modalViewWrapper;

    public void applyInsetMode(yf0.h insetMode, ViewGroup modalViewWrapper) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(modalViewWrapper, "modalViewWrapper");
        Intrinsics.checkNotNullParameter(modalViewWrapper, "<this>");
        c3.w(modalViewWrapper, true, yf0.a.f138952k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jc0.a0
    @NotNull
    public final z createModalContentContainerInternal(@NotNull Context context, Bundle bundle) {
        yf0.d dVar;
        Intrinsics.checkNotNullParameter(context, "context");
        if (bs1.c.c1(context)) {
            yf0.f fVar = context instanceof yf0.f ? (yf0.f) context : null;
            dVar = fVar != null ? fVar.getEdgeToEdgeConfiguration() : null;
        } else {
            dVar = yf0.b.f138956a;
        }
        BaseModalViewWrapper createModalView = createModalView(context, bundle);
        this.modalViewWrapper = createModalView;
        if (dVar instanceof yf0.c) {
            yf0.h hVar = ((yf0.c) dVar).f138957a;
            if (createModalView == null) {
                Intrinsics.r("modalViewWrapper");
                throw null;
            }
            applyInsetMode(hVar, createModalView);
        }
        onModalContentContainerCreated();
        BaseModalViewWrapper baseModalViewWrapper = this.modalViewWrapper;
        if (baseModalViewWrapper != null) {
            return baseModalViewWrapper;
        }
        Intrinsics.r("modalViewWrapper");
        throw null;
    }

    public abstract BaseModalViewWrapper createModalView(Context context, Bundle bundle);

    @Override // jc0.a0
    public View getEducationContainer() {
        return this.educationContainer;
    }

    @Override // jc0.a0
    @NotNull
    public z getModalContentContainer() {
        BaseModalViewWrapper baseModalViewWrapper = this.modalViewWrapper;
        if (baseModalViewWrapper != null) {
            return baseModalViewWrapper;
        }
        Intrinsics.r("modalViewWrapper");
        throw null;
    }

    @Override // jc0.a0
    public int getModalHeight() {
        BaseModalViewWrapper baseModalViewWrapper = this.modalViewWrapper;
        if (baseModalViewWrapper != null) {
            return baseModalViewWrapper.getHeight();
        }
        Intrinsics.r("modalViewWrapper");
        throw null;
    }

    @Override // jc0.a0
    public View getModalOverlay() {
        return this.internalOverlay;
    }

    @NotNull
    public final BaseModalViewWrapper getModalViewWrapper() {
        BaseModalViewWrapper baseModalViewWrapper = this.modalViewWrapper;
        if (baseModalViewWrapper != null) {
            return baseModalViewWrapper;
        }
        Intrinsics.r("modalViewWrapper");
        throw null;
    }

    @Override // jc0.a0
    public int getModalWidth() {
        BaseModalViewWrapper baseModalViewWrapper = this.modalViewWrapper;
        if (baseModalViewWrapper != null) {
            return baseModalViewWrapper.getWidth();
        }
        Intrinsics.r("modalViewWrapper");
        throw null;
    }

    @Override // jc0.a0
    @NotNull
    public a getOverrideAnimation() {
        return a.None;
    }

    @Override // jc0.a0
    public String getSavedInstanceStateKey() {
        return null;
    }

    public void setEducationContainer(View view) {
        this.educationContainer = view;
    }

    @Override // jc0.a0
    public void setOverlay(View view) {
        this.internalOverlay = view;
    }
}
