package qb;

import android.os.Build;
import kb.c0;
import kotlin.jvm.internal.Intrinsics;
import pb.h;
import tb.s;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f103384b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rb.a tracker) {
        super(tracker);
        this.f103384b = 1;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f103385c = 5;
    }

    @Override // qb.e
    public final boolean a(s workSpec) {
        switch (this.f103384b) {
            case 0:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.f117025j.f78991c;
            case 1:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.f117025j.f78993e;
            case 2:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.f117025j.f78989a == c0.CONNECTED;
            case 3:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                c0 c0Var = workSpec.f117025j.f78989a;
                if (c0Var != c0.UNMETERED) {
                    return Build.VERSION.SDK_INT >= 30 && c0Var == c0.TEMPORARILY_UNMETERED;
                }
                return true;
            default:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.f117025j.f78994f;
        }
    }

    @Override // qb.c
    public final int d() {
        return this.f103385c;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0031. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    @Override // qb.c
    public final boolean e(Object obj) {
        int i13 = this.f103384b;
        switch (i13) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                }
                return !booleanValue;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i13) {
                }
                return !booleanValue2;
            case 2:
                return f((h) obj);
            case 3:
                return f((h) obj);
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                switch (i13) {
                }
                return !booleanValue3;
        }
    }

    public final boolean f(h value) {
        switch (this.f103384b) {
            case 2:
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.f99416a && value.f99417b) {
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.f99416a && !value.f99418c) {
                    break;
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rb.f tracker, int i13) {
        super(tracker);
        this.f103384b = i13;
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            super(tracker);
            this.f103385c = 7;
        } else if (i13 == 3) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            super(tracker);
            this.f103385c = 7;
        } else if (i13 != 4) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            this.f103385c = 6;
        } else {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            super(tracker);
            this.f103385c = 9;
        }
    }
}
