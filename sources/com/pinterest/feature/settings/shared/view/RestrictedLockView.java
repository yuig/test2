package com.pinterest.feature.settings.shared.view;

import a.z0;
import android.content.Context;
import android.util.AttributeSet;
import fk2.g;
import g51.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import tk2.e;
import wj2.c;
import zc1.a;
import zc1.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/RestrictedLockView;", "Lcom/pinterest/design/brio/widget/IconView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RestrictedLockView extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final Unit f48326e = Unit.f80348a;

    /* renamed from: c, reason: collision with root package name */
    public d0 f48327c;

    /* renamed from: d, reason: collision with root package name */
    public r f48328d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RestrictedLockView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAttachedToWindow() && getVisibility() == 0) {
            new g(new z0(this, 18), 0).l(e.f118016b).h(c.a()).i(new h(this, 12), new ec1.a(21, b.f141586j));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictedLockView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setImageResource(sm1.b.ic_lock_gestalt);
        int i14 = eo1.b.color_gray_500;
        Object obj = d5.a.f53679a;
        f2(context.getColor(i14));
    }
}
