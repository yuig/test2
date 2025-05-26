package com.pinterest.feature.settings.notifications;

import com.pinterest.feature.settings.notifications.SettingsNotificationsFeatureLocation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SettingsNotificationsFeatureLocation.SETTINGS_NOTIFICATIONS f48174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(SettingsNotificationsFeatureLocation.SETTINGS_NOTIFICATIONS settings_notifications) {
        super(0);
        this.f48174i = settings_notifications;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return !((Boolean) this.f48174i.getNotificationsExperimentHelper().a("2025-02-10", "android_notifications_settings_redesign").f80346a).booleanValue() ? v.class : ib1.e.class;
    }
}
