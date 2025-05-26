package x4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class h extends b {

    /* renamed from: e, reason: collision with root package name */
    public int f131746e = -1;

    /* renamed from: f, reason: collision with root package name */
    public String f131747f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f131748g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f131749h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f131750i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f131751j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f131752k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f131753l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f131754m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f131755n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public int f131756o = 0;

    @Override // x4.b
    public final void a(HashMap hashMap) {
    }

    @Override // x4.b
    /* renamed from: b */
    public final b clone() {
        h hVar = new h();
        hVar.f131658a = this.f131658a;
        hVar.f131659b = this.f131659b;
        hVar.f131660c = this.f131660c;
        hVar.f131661d = this.f131661d;
        hVar.f131747f = this.f131747f;
        hVar.f131748g = this.f131748g;
        hVar.f131749h = this.f131749h;
        hVar.f131750i = this.f131750i;
        hVar.f131751j = Float.NaN;
        hVar.f131752k = this.f131752k;
        hVar.f131753l = this.f131753l;
        hVar.f131754m = this.f131754m;
        hVar.f131755n = this.f131755n;
        return hVar;
    }

    @Override // x4.b
    public final /* bridge */ /* synthetic */ void c(HashSet hashSet) {
    }

    @Override // x4.b
    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.s.KeyPosition);
        SparseIntArray sparseIntArray = g.f131745a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            SparseIntArray sparseIntArray2 = g.f131745a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.f17523m0) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f131659b);
                        this.f131659b = resourceId;
                        if (resourceId == -1) {
                            this.f131660c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f131660c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f131659b = obtainStyledAttributes.getResourceId(index, this.f131659b);
                        break;
                    }
                case 2:
                    this.f131658a = obtainStyledAttributes.getInt(index, this.f131658a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f131747f = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f131747f = t4.e.f116352c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f131746e = obtainStyledAttributes.getInteger(index, this.f131746e);
                    break;
                case 5:
                    this.f131749h = obtainStyledAttributes.getInt(index, this.f131749h);
                    break;
                case 6:
                    this.f131752k = obtainStyledAttributes.getFloat(index, this.f131752k);
                    break;
                case 7:
                    this.f131753l = obtainStyledAttributes.getFloat(index, this.f131753l);
                    break;
                case 8:
                    float f13 = obtainStyledAttributes.getFloat(index, this.f131751j);
                    this.f131750i = f13;
                    this.f131751j = f13;
                    break;
                case 9:
                    this.f131756o = obtainStyledAttributes.getInt(index, this.f131756o);
                    break;
                case 10:
                    this.f131748g = obtainStyledAttributes.getInt(index, this.f131748g);
                    break;
                case 11:
                    this.f131750i = obtainStyledAttributes.getFloat(index, this.f131750i);
                    break;
                case 12:
                    this.f131751j = obtainStyledAttributes.getFloat(index, this.f131751j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f131658a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public final void g(String str, Object obj) {
        switch (str) {
            case "transitionEasing":
                this.f131747f = obj.toString();
                break;
            case "percentWidth":
                this.f131750i = b.f((Number) obj);
                break;
            case "percentHeight":
                this.f131751j = b.f((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.f131749h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float f13 = b.f((Number) obj);
                this.f131750i = f13;
                this.f131751j = f13;
                break;
            case "percentX":
                this.f131752k = b.f((Number) obj);
                break;
            case "percentY":
                this.f131753l = b.f((Number) obj);
                break;
        }
    }
}
