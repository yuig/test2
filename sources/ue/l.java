package ue;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import le.v;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Long f121963a;

    /* renamed from: b, reason: collision with root package name */
    public Long f121964b;

    /* renamed from: c, reason: collision with root package name */
    public UUID f121965c;

    /* renamed from: d, reason: collision with root package name */
    public int f121966d;

    /* renamed from: e, reason: collision with root package name */
    public Long f121967e;

    /* renamed from: f, reason: collision with root package name */
    public n f121968f;

    public l(Long l13, Long l14) {
        UUID sessionId = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(sessionId, "randomUUID()");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f121963a = l13;
        this.f121964b = l14;
        this.f121965c = sessionId;
    }

    public final void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(v.a()).edit();
        Long l13 = this.f121963a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l13 == null ? 0L : l13.longValue());
        Long l14 = this.f121964b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l14 != null ? l14.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f121966d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f121965c.toString());
        edit.apply();
        n nVar = this.f121968f;
        if (nVar == null || nVar == null) {
            return;
        }
        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(v.a()).edit();
        edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", nVar.f121971a);
        edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", nVar.f121972b);
        edit2.apply();
    }
}
