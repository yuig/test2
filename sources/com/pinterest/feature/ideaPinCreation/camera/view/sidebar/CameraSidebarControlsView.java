package com.pinterest.feature.ideaPinCreation.camera.view.sidebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import aq1.f;
import aq1.h;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraTimerDurationsView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import tt0.n0;
import tt0.z;
import ut0.e;
import ut0.g;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/camera/view/sidebar/CameraSidebarControlsView;", "Landroid/widget/LinearLayout;", "Ltt0/n0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ut0/e", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CameraSidebarControlsView extends LinearLayout implements n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f45950h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f45951a;

    /* renamed from: b, reason: collision with root package name */
    public final v f45952b;

    /* renamed from: c, reason: collision with root package name */
    public final v f45953c;

    /* renamed from: d, reason: collision with root package name */
    public final v f45954d;

    /* renamed from: e, reason: collision with root package name */
    public final v f45955e;

    /* renamed from: f, reason: collision with root package name */
    public final v f45956f;

    /* renamed from: g, reason: collision with root package name */
    public e f45957g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraSidebarControlsView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45951a = m.b(new g(this, 5));
        this.f45952b = m.b(new g(this, 3));
        this.f45953c = m.b(new g(this, 4));
        this.f45954d = m.b(new g(this, 2));
        this.f45955e = m.b(new g(this, 1));
        this.f45956f = m.b(new g(this, 0));
        View.inflate(getContext(), f.view_idea_pin_creation_camera_sidebar_controls, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        e().X(h.idea_pin_camera_speed_control_title, h.story_pin_camera_speed_control_content_description, q.SPEED);
        i(rt0.e.OFF);
        c().X(h.idea_pin_camera_flash_title, h.idea_pin_camera_flash_content_description, q.FLASH_SLASH);
        d().X(h.idea_pin_camera_switch_lens_title, h.idea_pin_camera_switch_lens_content_description, q.CAMERA_FLIP);
        h();
    }

    public final IdeaPinCreationCameraTimerDurationsView a() {
        Object value = this.f45956f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IdeaPinCreationCameraTimerDurationsView) value;
    }

    public final CameraSidebarButtonView b() {
        Object value = this.f45955e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CameraSidebarButtonView) value;
    }

    public final CameraSidebarButtonView c() {
        Object value = this.f45954d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CameraSidebarButtonView) value;
    }

    public final CameraSidebarButtonView d() {
        Object value = this.f45952b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CameraSidebarButtonView) value;
    }

    public final CameraSidebarButtonView e() {
        Object value = this.f45951a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CameraSidebarButtonView) value;
    }

    public final rt0.e f() {
        return (rt0.e) a().f45896b;
    }

    public final void g() {
        Object value = this.f45953c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((IdeaPinCreationCameraSpeedControlView) value).setVisibility(8);
        a().setVisibility(8);
    }

    public final void h() {
        final int i13 = 0;
        c().setOnClickListener(new View.OnClickListener(this) { // from class: ut0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraSidebarControlsView f123095b;

            {
                this.f123095b = listener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                CameraSidebarControlsView this$0 = this.f123095b;
                switch (i14) {
                    case 0:
                        int i15 = CameraSidebarControlsView.f45950h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        e eVar = this$0.f45957g;
                        if (eVar != null) {
                            ((z) eVar).f119240e.f119214g.invoke();
                            break;
                        }
                        break;
                    default:
                        int i16 = CameraSidebarControlsView.f45950h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.a().getVisibility() != 0) {
                            kg.a.s(this$0.a(), 0L, null, 6);
                            break;
                        } else {
                            kg.a.u(this$0.a(), 0, 0L, 6);
                            break;
                        }
                }
            }
        });
        final int i14 = 1;
        b().setOnClickListener(new View.OnClickListener(this) { // from class: ut0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraSidebarControlsView f123095b;

            {
                this.f123095b = listener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                CameraSidebarControlsView this$0 = this.f123095b;
                switch (i142) {
                    case 0:
                        int i15 = CameraSidebarControlsView.f45950h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        e eVar = this$0.f45957g;
                        if (eVar != null) {
                            ((z) eVar).f119240e.f119214g.invoke();
                            break;
                        }
                        break;
                    default:
                        int i16 = CameraSidebarControlsView.f45950h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.a().getVisibility() != 0) {
                            kg.a.s(this$0.a(), 0L, null, 6);
                            break;
                        } else {
                            kg.a.u(this$0.a(), 0, 0L, 6);
                            break;
                        }
                }
            }
        });
        IdeaPinCreationCameraTimerDurationsView a13 = a();
        a13.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        a13.f45924f = this;
    }

    public final void i(rt0.e eVar) {
        q qVar;
        int i13 = ut0.f.f123096a[eVar.ordinal()];
        if (i13 == 1) {
            qVar = q.TIMER;
        } else if (i13 == 2) {
            qVar = q.TIMER_3;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            qVar = q.TIMER_10;
        }
        b().X(h.idea_pin_timer, h.idea_pin_timer_content_description, qVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraSidebarControlsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45951a = m.b(new g(this, 5));
        this.f45952b = m.b(new g(this, 3));
        this.f45953c = m.b(new g(this, 4));
        this.f45954d = m.b(new g(this, 2));
        this.f45955e = m.b(new g(this, 1));
        this.f45956f = m.b(new g(this, 0));
        View.inflate(getContext(), f.view_idea_pin_creation_camera_sidebar_controls, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        e().X(h.idea_pin_camera_speed_control_title, h.story_pin_camera_speed_control_content_description, q.SPEED);
        i(rt0.e.OFF);
        c().X(h.idea_pin_camera_flash_title, h.idea_pin_camera_flash_content_description, q.FLASH_SLASH);
        d().X(h.idea_pin_camera_switch_lens_title, h.idea_pin_camera_switch_lens_content_description, q.CAMERA_FLIP);
        h();
    }
}
