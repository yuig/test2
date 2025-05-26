package rq;

import com.pinterest.api.model.mv;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z7;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109277i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k0 f109278j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, int i13) {
        super(1);
        this.f109277i = i13;
        this.f109278j = k0Var;
    }

    public final rn1.a b(rn1.a it) {
        String str;
        String str2;
        Instant instant;
        ZonedDateTime atZone;
        mv s13;
        int i13 = this.f109277i;
        k0 k0Var = this.f109278j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                wy0 wy0Var = k0Var.f109338q;
                if (wy0Var == null || (str = wy0Var.U2()) == null) {
                    str = "";
                }
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                k0Var.getClass();
                LocalDateTime now = LocalDateTime.now();
                z7 z7Var = k0Var.f109337p;
                ChronoLocalDateTime<LocalDate> chronoLocalDateTime = null;
                Date E = (z7Var == null || (s13 = z7Var.s()) == null) ? null : s13.E();
                if (E != null && (instant = E.toInstant()) != null && (atZone = instant.atZone(ZoneId.systemDefault())) != null) {
                    chronoLocalDateTime = atZone.toLocalDateTime();
                }
                Duration between = Duration.between(chronoLocalDateTime, now);
                long minutes = between.toMinutes();
                long hours = between.toHours();
                long days = between.toDays();
                if (minutes < 60) {
                    str2 = minutes + "m";
                } else if (hours < 24) {
                    str2 = hours + "h";
                } else {
                    str2 = days + "d";
                }
                return rn1.a.y(it, bs1.c.h2(str2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f109277i) {
        }
        return b((rn1.a) obj);
    }
}
