package x4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public int f131702e = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f131703f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f131704g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f131705h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f131706i = Float.NaN;

    /* renamed from: j, reason: collision with root package name */
    public float f131707j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f131708k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f131709l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f131710m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f131711n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f131712o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f131713p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f131714q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f131715r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public float f131716s = Float.NaN;

    public d() {
        this.f131661d = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x009c, code lost:
    
        if (r1.equals("scaleY") == false) goto L15;
     */
    @Override // x4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.HashMap r7) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.d.a(java.util.HashMap):void");
    }

    @Override // x4.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        d dVar = new d();
        dVar.f131658a = this.f131658a;
        dVar.f131659b = this.f131659b;
        dVar.f131660c = this.f131660c;
        dVar.f131661d = this.f131661d;
        dVar.f131702e = this.f131702e;
        dVar.f131703f = this.f131703f;
        dVar.f131704g = this.f131704g;
        dVar.f131705h = this.f131705h;
        dVar.f131706i = this.f131706i;
        dVar.f131707j = this.f131707j;
        dVar.f131708k = this.f131708k;
        dVar.f131709l = this.f131709l;
        dVar.f131710m = this.f131710m;
        dVar.f131711n = this.f131711n;
        dVar.f131712o = this.f131712o;
        dVar.f131713p = this.f131713p;
        dVar.f131714q = this.f131714q;
        dVar.f131715r = this.f131715r;
        dVar.f131716s = this.f131716s;
        return dVar;
    }

    @Override // x4.b
    public final void c(HashSet hashSet) {
        if (!Float.isNaN(this.f131703f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f131704g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f131705h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f131706i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f131707j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f131708k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f131709l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f131713p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f131714q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f131715r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f131710m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f131711n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f131712o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f131716s)) {
            hashSet.add("progress");
        }
        if (this.f131661d.size() > 0) {
            Iterator it = this.f131661d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // x4.b
    public final void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.s.KeyAttribute);
        SparseIntArray sparseIntArray = c.f131688a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            SparseIntArray sparseIntArray2 = c.f131688a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f131703f = obtainStyledAttributes.getFloat(index, this.f131703f);
                    break;
                case 2:
                    this.f131704g = obtainStyledAttributes.getDimension(index, this.f131704g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f131705h = obtainStyledAttributes.getFloat(index, this.f131705h);
                    break;
                case 5:
                    this.f131706i = obtainStyledAttributes.getFloat(index, this.f131706i);
                    break;
                case 6:
                    this.f131707j = obtainStyledAttributes.getFloat(index, this.f131707j);
                    break;
                case 7:
                    this.f131711n = obtainStyledAttributes.getFloat(index, this.f131711n);
                    break;
                case 8:
                    this.f131710m = obtainStyledAttributes.getFloat(index, this.f131710m);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f131658a = obtainStyledAttributes.getInt(index, this.f131658a);
                    break;
                case 13:
                    this.f131702e = obtainStyledAttributes.getInteger(index, this.f131702e);
                    break;
                case 14:
                    this.f131712o = obtainStyledAttributes.getFloat(index, this.f131712o);
                    break;
                case 15:
                    this.f131713p = obtainStyledAttributes.getDimension(index, this.f131713p);
                    break;
                case 16:
                    this.f131714q = obtainStyledAttributes.getDimension(index, this.f131714q);
                    break;
                case 17:
                    this.f131715r = obtainStyledAttributes.getDimension(index, this.f131715r);
                    break;
                case 18:
                    this.f131716s = obtainStyledAttributes.getFloat(index, this.f131716s);
                    break;
                case 19:
                    this.f131708k = obtainStyledAttributes.getDimension(index, this.f131708k);
                    break;
                case 20:
                    this.f131709l = obtainStyledAttributes.getDimension(index, this.f131709l);
                    break;
            }
        }
    }

    @Override // x4.b
    public final void e(HashMap hashMap) {
        if (this.f131702e == -1) {
            return;
        }
        if (!Float.isNaN(this.f131703f)) {
            hashMap.put("alpha", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131704g)) {
            hashMap.put("elevation", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131705h)) {
            hashMap.put("rotation", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131706i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131707j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131708k)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131709l)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131713p)) {
            hashMap.put("translationX", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131714q)) {
            hashMap.put("translationY", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131715r)) {
            hashMap.put("translationZ", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131710m)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131711n)) {
            hashMap.put("scaleX", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131712o)) {
            hashMap.put("scaleY", Integer.valueOf(this.f131702e));
        }
        if (!Float.isNaN(this.f131716s)) {
            hashMap.put("progress", Integer.valueOf(this.f131702e));
        }
        if (this.f131661d.size() > 0) {
            Iterator it = this.f131661d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(a.a.j("CUSTOM,", (String) it.next()), Integer.valueOf(this.f131702e));
            }
        }
    }

    public final void g(String str, Object obj) {
        switch (str) {
            case "motionProgress":
                this.f131716s = b.f((Number) obj);
                break;
            case "transitionEasing":
                obj.toString();
                break;
            case "rotationX":
                this.f131706i = b.f((Number) obj);
                break;
            case "rotationY":
                this.f131707j = b.f((Number) obj);
                break;
            case "translationX":
                this.f131713p = b.f((Number) obj);
                break;
            case "translationY":
                this.f131714q = b.f((Number) obj);
                break;
            case "translationZ":
                this.f131715r = b.f((Number) obj);
                break;
            case "scaleX":
                this.f131711n = b.f((Number) obj);
                break;
            case "scaleY":
                this.f131712o = b.f((Number) obj);
                break;
            case "transformPivotX":
                this.f131708k = b.f((Number) obj);
                break;
            case "transformPivotY":
                this.f131709l = b.f((Number) obj);
                break;
            case "rotation":
                this.f131705h = b.f((Number) obj);
                break;
            case "elevation":
                this.f131704g = b.f((Number) obj);
                break;
            case "transitionPathRotate":
                this.f131710m = b.f((Number) obj);
                break;
            case "alpha":
                this.f131703f = b.f((Number) obj);
                break;
            case "curveFit":
                Number number = (Number) obj;
                this.f131702e = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "visibility":
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                } else {
                    break;
                }
        }
    }
}
