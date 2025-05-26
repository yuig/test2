package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c52.d;
import com.pinterest.feature.settings.shared.view.UnsavedChangesModalView;
import com.pinterest.gestalt.button.view.GestaltButton;
import gm1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;
import zc1.e;
import zc1.i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/UnsavedChangesModalView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UnsavedChangesModalView extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f48372d = 0;

    /* renamed from: a, reason: collision with root package name */
    public s f48373a;

    /* renamed from: b, reason: collision with root package name */
    public s f48374b;

    /* renamed from: c, reason: collision with root package name */
    public final v f48375c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnsavedChangesModalView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UnsavedChangesModalView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsavedChangesModalView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i14 = 1;
        v b13 = m.b(new i(this, 1));
        final int i15 = 0;
        v b14 = m.b(new i(this, 0));
        this.f48373a = e.f141595m;
        this.f48374b = e.f141594l;
        this.f48375c = m.b(e.f141593k);
        View.inflate(context, d.modal_edit_profile_changes, this);
        setOrientation(1);
        Object value = b14.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltButton) value).e(new a(this) { // from class: zc1.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnsavedChangesModalView f141606b;

            {
                this.f141606b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i15;
                UnsavedChangesModalView this$0 = this.f141606b;
                switch (i16) {
                    case 0:
                        int i17 = UnsavedChangesModalView.f48372d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f48374b.invoke();
                        break;
                    default:
                        int i18 = UnsavedChangesModalView.f48372d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f48373a.invoke();
                        break;
                }
            }
        });
        Object value2 = b13.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltButton) value2).e(new a(this) { // from class: zc1.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnsavedChangesModalView f141606b;

            {
                this.f141606b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i14;
                UnsavedChangesModalView this$0 = this.f141606b;
                switch (i16) {
                    case 0:
                        int i17 = UnsavedChangesModalView.f48372d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f48374b.invoke();
                        break;
                    default:
                        int i18 = UnsavedChangesModalView.f48372d;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f48373a.invoke();
                        break;
                }
            }
        });
    }
}
