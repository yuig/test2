package pf2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l7.b0;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final ki2.a f100027a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f100028b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f100029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Looper looper, ki2.a anrMonitorWorker, og2.a clock) {
        super(looper);
        looper.getQueue();
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(anrMonitorWorker, "anrMonitorWorker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f100027a = anrMonitorWorker;
        this.f100028b = clock;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        try {
            q qVar = s.f135225b;
            if (msg.what == 34593) {
                this.f100027a.b(new b0(this, this.f100028b.now(), 6));
            }
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }
}
