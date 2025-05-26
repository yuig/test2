package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c52.c;
import c52.d;
import com.pinterest.design.brio.widget.voice.PinterestVoiceLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ve0.b;
import ve0.f;
import ve0.q;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/SettingsEducationTooltip;", "Lcom/pinterest/design/brio/widget/voice/PinterestVoiceLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsEducationTooltip extends PinterestVoiceLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f48332l = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f48333f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltText f48334g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltButton f48335h;

    /* renamed from: i, reason: collision with root package name */
    public final long f48336i;

    /* renamed from: j, reason: collision with root package name */
    public final float f48337j;

    /* renamed from: k, reason: collision with root package name */
    public final v f48338k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsEducationTooltip(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final f d() {
        return (q) this.f48338k.getValue();
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final void e(Context context, b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.e(context, bVar);
        LayoutInflater.from(context).inflate(d.view_settings_education_tooltip, (ViewGroup) this, true);
        View findViewById = findViewById(c.tooltip_message);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48334g = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.tooltip_action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48335h = (GestaltButton) findViewById2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsEducationTooltip(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48333f = bs1.c.Z(this, eo1.c.lego_spacing_vertical_medium);
        this.f48336i = 500L;
        this.f48337j = bs1.c.Z(this, eo1.c.voice_message_anim_y_offset);
        this.f48338k = m.b(new p91.v(13, this, context));
    }
}
