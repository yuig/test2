package iz;

import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liz/q;", "Lnl1/d;", "<init>", "()V", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class q extends b0 {

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f73869c0 = d4.IN_APP_SURVEY;

    /* renamed from: d0, reason: collision with root package name */
    public final xk2.v f73870d0 = xk2.m.b(new lr.v(this, 19));

    public q() {
        this.E = cz.l.view_survey_start_message;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF73869c0() {
        return this.f73869c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        ((GestaltText) v13.findViewById(cz.k.tvStartMessage)).i(new wt.c(this, 28));
    }
}
