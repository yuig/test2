package ads_mobile_sdk;

import a.h4;
import a.pd;
import a.qb;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Method;
import java.util.Map;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class zr2 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final Map f14902f;

    /* renamed from: g, reason: collision with root package name */
    public final a.m f14903g;

    /* renamed from: h, reason: collision with root package name */
    public final DisplayMetrics f14904h;

    public zr2(pd pdVar, a.m mVar, Map map, DisplayMetrics displayMetrics, bt2 bt2Var) {
        super("yw59fUoiFLFk87900j2AbL3r5pOxSz1z9qw1E6EvmPjkt1HJA6+47GU/149BNbaf", "DtXyVgu6wj5u7z/p+DEVFk+1Cv8p6Jl46qLA+dSQyD0=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_TOUCH_SIGNALS_TASK));
        this.f14903g = mVar;
        this.f14902f = map;
        this.f14904h = displayMetrics;
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object[] objArr = (Object[]) method.invoke("", (MotionEvent) this.f14902f.get("nv"), this.f14904h);
        objArr.getClass();
        qb r13 = tb.r();
        Object obj = objArr[0];
        if (obj != null && objArr[1] != null) {
            long longValue = ((Long) obj).longValue();
            r13.b();
            tb tbVar = (tb) r13.f10110b;
            i28 = tbVar.bitField0_;
            tbVar.bitField0_ = i28 | 1;
            tbVar.tcxSignal_ = longValue;
            long longValue2 = ((Long) objArr[1]).longValue();
            r13.b();
            tb tbVar2 = (tb) r13.f10110b;
            i29 = tbVar2.bitField0_;
            tbVar2.bitField0_ = i29 | 2;
            tbVar2.tcySignal_ = longValue2;
        }
        Object obj2 = objArr[2];
        if (obj2 != null) {
            long longValue3 = ((Long) obj2).longValue();
            r13.b();
            tb tbVar3 = (tb) r13.f10110b;
            i27 = tbVar3.bitField0_;
            tbVar3.bitField0_ = i27 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            tbVar3.tctMs_ = longValue3;
        }
        Object obj3 = objArr[3];
        if (obj3 != null) {
            long longValue4 = ((Long) obj3).longValue();
            r13.b();
            tb tbVar4 = (tb) r13.f10110b;
            i26 = tbVar4.bitField0_;
            tbVar4.bitField0_ = i26 | 16;
            tbVar4.tcp_ = longValue4;
        }
        Object obj4 = objArr[4];
        if (obj4 != null) {
            long longValue5 = ((Long) obj4).longValue();
            r13.b();
            tb tbVar5 = (tb) r13.f10110b;
            i25 = tbVar5.bitField0_;
            tbVar5.bitField0_ = i25 | 4;
            tbVar5.tcd_ = longValue5;
        }
        Object obj5 = objArr[5];
        if (obj5 != null) {
            gc gcVar = ((Long) obj5).longValue() != 0 ? gc.ENUM_TRUE : gc.ENUM_FALSE;
            r13.b();
            tb tbVar6 = (tb) r13.f10110b;
            tbVar6.getClass();
            tbVar6.obscured_ = gcVar.f5504a;
            i24 = tbVar6.bitField0_;
            tbVar6.bitField0_ = i24 | 64;
        }
        Object obj6 = objArr[6];
        if (obj6 != null) {
            long longValue6 = ((Long) obj6).longValue();
            r13.b();
            tb tbVar7 = (tb) r13.f10110b;
            i23 = tbVar7.bitField0_;
            tbVar7.bitField0_ = i23 | BitmapUtils.BITMAP_TO_JPEG_SIZE;
            tbVar7.source_ = longValue6;
        }
        Object obj7 = objArr[7];
        if (obj7 != null) {
            long longValue7 = ((Long) obj7).longValue();
            r13.b();
            tb tbVar8 = (tb) r13.f10110b;
            i19 = tbVar8.bitField0_;
            tbVar8.bitField0_ = i19 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
            tbVar8.toolType_ = longValue7;
        }
        Object obj8 = objArr[8];
        if (obj8 != null) {
            gc gcVar2 = ((Long) obj8).longValue() != 0 ? gc.ENUM_TRUE : gc.ENUM_FALSE;
            r13.b();
            tb tbVar9 = (tb) r13.f10110b;
            tbVar9.getClass();
            tbVar9.isPhysicalTouch_ = gcVar2.f5504a;
            i18 = tbVar9.bitField0_;
            tbVar9.bitField0_ = i18 | 1024;
        }
        synchronized (pdVar) {
            a(pdVar);
            mb1 mb1Var = (mb1) this.f14902f.get("oe");
            if (mb1Var != null) {
                long j13 = mb1Var.f8148a;
                if (j13 > 0) {
                    pdVar.b();
                    wb wbVar = (wb) pdVar.f10110b;
                    i16 = wbVar.bitField1_;
                    wbVar.bitField1_ = 8 | i16;
                    wbVar.tcdnSignal_ = j13;
                }
                long j14 = mb1Var.f8149b;
                if (j14 > 0) {
                    pdVar.b();
                    wb wbVar2 = (wb) pdVar.f10110b;
                    i15 = wbVar2.bitField1_;
                    wbVar2.bitField1_ = 4 | i15;
                    wbVar2.tcmSignal_ = j14;
                }
                long j15 = mb1Var.f8150c;
                if (j15 > 0) {
                    pdVar.b();
                    wb wbVar3 = (wb) pdVar.f10110b;
                    i14 = wbVar3.bitField1_;
                    wbVar3.bitField1_ = 2 | i14;
                    wbVar3.tcuSignal_ = j15;
                }
                long j16 = mb1Var.f8151d;
                if (j16 > 0) {
                    pdVar.b();
                    wb wbVar4 = (wb) pdVar.f10110b;
                    i13 = wbVar4.bitField1_;
                    wbVar4.bitField1_ = i13 | 16;
                    wbVar4.tccSignal_ = j16;
                }
            }
            a(r13);
            pdVar.b();
            wb wbVar5 = (wb) pdVar.f10110b;
            tb tbVar10 = (tb) r13.a();
            wbVar5.getClass();
            wbVar5.touch_ = tbVar10;
            i17 = wbVar5.bitField1_;
            wbVar5.bitField1_ = i17 | 262144;
            b(pdVar);
        }
    }

    public final void b(pd pdVar) {
        DisplayMetrics displayMetrics;
        int i13;
        int i14;
        h4 h4Var;
        h4 h4Var2;
        nb1[] nb1VarArr = (nb1[]) this.f14902f.get("ro");
        if (nb1VarArr == null || (displayMetrics = this.f14904h) == null || displayMetrics.density == 0.0f) {
            return;
        }
        for (int i15 = 0; i15 <= nb1VarArr.length - 2; i15++) {
            nb1 nb1Var = nb1VarArr[i15];
            qb r13 = tb.r();
            double d2 = nb1Var.f8740a;
            this.f14904h.getClass();
            long round = Math.round(d2 / r6.density);
            r13.b();
            tb tbVar = (tb) r13.f10110b;
            i13 = tbVar.bitField0_;
            tbVar.bitField0_ = i13 | 1;
            tbVar.tcxSignal_ = round;
            double d13 = nb1Var.f8741b;
            this.f14904h.getClass();
            long round2 = Math.round(d13 / r2.density);
            r13.b();
            tb tbVar2 = (tb) r13.f10110b;
            i14 = tbVar2.bitField0_;
            tbVar2.bitField0_ = i14 | 2;
            tbVar2.tcySignal_ = round2;
            tb tbVar3 = (tb) r13.a();
            pdVar.b();
            wb wbVar = (wb) pdVar.f10110b;
            wbVar.getClass();
            h4Var = wbVar.previousTouches_;
            if (!((j) h4Var).f6594a) {
                wbVar.previousTouches_ = e0.t.a(h4Var);
            }
            h4Var2 = wbVar.previousTouches_;
            h4Var2.add(tbVar3);
        }
    }

    public final void a(pd pdVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Method a13 = ((bb1) this.f14903g).a("uKnTol4WGZdg7Tx7ukqLuSAQ9Ci/j1cVYSn4AJxSZ0LIVQIwtIvV+4pnA1lNDgob", "+BjG/XIzQL6tafVSSF65xVntIvYTV8w+40ghdJ0hSu8=");
        a13.getClass();
        Object[] objArr = (Object[]) a13.invoke("", (MotionEvent) this.f14902f.get("nv"), this.f14904h);
        objArr.getClass();
        Object obj = objArr[0];
        if (obj != null) {
            long longValue = ((Long) obj).longValue();
            pdVar.b();
            wb wbVar = (wb) pdVar.f10110b;
            i17 = wbVar.bitField0_;
            wbVar.bitField0_ = i17 | 8192;
            wbVar.tcxSignal_ = longValue;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            long longValue2 = ((Long) obj2).longValue();
            pdVar.b();
            wb wbVar2 = (wb) pdVar.f10110b;
            i16 = wbVar2.bitField0_;
            wbVar2.bitField0_ = i16 | 16384;
            wbVar2.tcySignal_ = longValue2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            long longValue3 = ((Long) obj3).longValue();
            pdVar.b();
            wb wbVar3 = (wb) pdVar.f10110b;
            i15 = wbVar3.bitField0_;
            wbVar3.bitField0_ = i15 | 32768;
            wbVar3.tctSignal_ = longValue3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            long longValue4 = ((Long) obj4).longValue();
            pdVar.b();
            wb wbVar4 = (wb) pdVar.f10110b;
            i14 = wbVar4.bitField0_;
            wbVar4.bitField0_ = i14 | 1073741824;
            wbVar4.tcpSignal_ = longValue4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            long longValue5 = ((Long) obj5).longValue();
            pdVar.b();
            wb wbVar5 = (wb) pdVar.f10110b;
            i13 = wbVar5.bitField0_;
            wbVar5.bitField0_ = i13 | Integer.MIN_VALUE;
            wbVar5.tcdSignal_ = longValue5;
        }
    }

    public final void a(qb qbVar) {
        DisplayMetrics displayMetrics;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        mb1 mb1Var = (mb1) this.f14902f.get("oe");
        if (mb1Var == null || mb1Var.f8148a == 0 || (displayMetrics = this.f14904h) == null) {
            return;
        }
        float f13 = displayMetrics.density;
        if (f13 != 0.0f) {
            long round = Math.round(mb1Var.f8154g / f13);
            qbVar.b();
            tb tbVar = (tb) qbVar.f10110b;
            i13 = tbVar.bitField0_;
            tbVar.bitField0_ = i13 | 4096;
            tbVar.pathDistanceSignal_ = round;
            long round2 = Math.round((mb1Var.f8157j - mb1Var.f8155h) / this.f14904h.density);
            qbVar.b();
            tb tbVar2 = (tb) qbVar.f10110b;
            i14 = tbVar2.bitField0_;
            tbVar2.bitField0_ = i14 | 8192;
            tbVar2.viewXSignal_ = round2;
            long round3 = Math.round((mb1Var.f8158k - mb1Var.f8156i) / this.f14904h.density);
            qbVar.b();
            tb tbVar3 = (tb) qbVar.f10110b;
            i15 = tbVar3.bitField0_;
            tbVar3.bitField0_ = i15 | 16384;
            tbVar3.viewYSignal_ = round3;
            long round4 = Math.round(mb1Var.f8155h / this.f14904h.density);
            qbVar.b();
            tb tbVar4 = (tb) qbVar.f10110b;
            i16 = tbVar4.bitField0_;
            tbVar4.bitField0_ = i16 | 131072;
            tbVar4.tcxDownSignal_ = round4;
            long round5 = Math.round(mb1Var.f8156i / this.f14904h.density);
            qbVar.b();
            tb tbVar5 = (tb) qbVar.f10110b;
            i17 = tbVar5.bitField0_;
            tbVar5.bitField0_ = i17 | 262144;
            tbVar5.tcyDownSignal_ = round5;
            if (((MotionEvent) this.f14902f.get("nv")) == null) {
                return;
            }
            long round6 = Math.round(((r1.getRawX() + (mb1Var.f8155h - mb1Var.f8157j)) - r1.getX()) / this.f14904h.density);
            if (round6 != 0) {
                qbVar.b();
                tb tbVar6 = (tb) qbVar.f10110b;
                i19 = tbVar6.bitField0_;
                tbVar6.bitField0_ = i19 | 32768;
                tbVar6.viewDxSignal_ = round6;
            }
            long round7 = Math.round(((r1.getRawY() + (mb1Var.f8156i - mb1Var.f8158k)) - r1.getY()) / this.f14904h.density);
            if (round7 != 0) {
                qbVar.b();
                tb tbVar7 = (tb) qbVar.f10110b;
                i18 = tbVar7.bitField0_;
                tbVar7.bitField0_ = i18 | 65536;
                tbVar7.viewDySignal_ = round7;
            }
        }
    }
}
