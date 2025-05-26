package com.pinterest.feature.search.visual.cropper;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class h extends FlashlightCropperView implements j {

    /* renamed from: x, reason: collision with root package name */
    public final k f48029x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f48030y;

    /* renamed from: z, reason: collision with root package name */
    public i f48031z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, k zoomableImageListener, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(zoomableImageListener, "zoomableImageListener");
        this.f48029x = zoomableImageListener;
        this.f48030y = z13;
    }

    public final void C(float f13, float f14) {
        f fVar = this.f47973u;
        int i13 = fVar == null ? -1 : g.f48028a[fVar.ordinal()];
        RectF rectF = this.f47964l;
        switch (i13) {
            case 1:
                t(f13, f14, rectF.right, rectF.bottom);
                break;
            case 2:
                t(rectF.left, f14, f13, rectF.bottom);
                break;
            case 3:
                t(f13, rectF.top, rectF.right, f14);
                break;
            case 4:
                t(rectF.left, rectF.top, f13, f14);
                break;
            case 5:
                t(rectF.left, f14, rectF.right, rectF.bottom);
                break;
            case 6:
                t(f13, Math.min(this.f47958f, rectF.top), rectF.right, rectF.bottom);
                break;
            case 7:
                t(rectF.left, rectF.top, f13, rectF.bottom);
                break;
            case 8:
                t(Math.min(this.f47957e, rectF.left), rectF.top, rectF.right, f14);
                break;
        }
    }

    public final void D(float f13, float f14) {
        o80.j jVar = ((m) this.f48029x).f48040y.f61465p0;
        if (jVar != null) {
            jVar.j(f13, f14);
        }
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF84416a1() {
        return this.f48030y ? d4.FLASHLIGHT : d4.PINCH_TO_ZOOM;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pinterest.feature.search.visual.cropper.FlashlightCropperView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionIndex() != 0 || this.f47974v == null || this.f47971s) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        RectF cropperBounds = this.f47966n;
        RectF maxBounds = this.f47963k;
        RectF minBounds = this.f47964l;
        if (actionMasked == 0) {
            i iVar = this.f48031z;
            if (iVar != null) {
                l lVar = (l) iVar;
                lVar.f48036e = 0.0f;
                lVar.f48037f = 0.0f;
                lVar.f48038g = false;
                lVar.f48039h = false;
            }
            x(motionEvent, true);
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            d dVar = this.f47967o;
            float f13 = this.f47954b;
            if (dVar.f48016d.a(x13, y13, f13, f13, f13, f13)) {
                z();
                n();
            } else {
                d dVar2 = this.f47967o;
                float f14 = this.f47954b;
                if (dVar2.f48017e.a(x13, y13, f14, f14, f14, f14)) {
                    z();
                    o();
                } else {
                    d dVar3 = this.f47967o;
                    float f15 = this.f47954b;
                    if (dVar3.f48018f.a(x13, y13, f15, f15, f15, f15)) {
                        z();
                        k();
                    } else {
                        d dVar4 = this.f47967o;
                        float f16 = this.f47954b;
                        if (dVar4.f48019g.a(x13, y13, f16, f16, f16, f16)) {
                            z();
                            this.f47973u = f.DRAG_BOTTOM_RIGHT;
                            float f17 = this.f47957e;
                            float f18 = this.f47958f;
                            float f19 = this.f47961i;
                            minBounds.set(f17, f18, f17 + f19, f19 + f18);
                        } else if (b(x13, y13)) {
                            z();
                            m();
                        } else if (g(x13, y13)) {
                            z();
                            this.f47973u = f.DRAG_TOP_LINE;
                            float f23 = this.f47957e;
                            float f24 = this.f47958f + this.f47960h;
                            float f25 = this.f47962j;
                            float f26 = f24 - f25;
                            minBounds.set(f23, f26, this.f47959g + f23, f25 + f26);
                        } else if (e(x13, y13)) {
                            z();
                            this.f47973u = f.DRAG_RIGHT_LINE;
                            float f27 = this.f47957e;
                            float f28 = this.f47958f;
                            minBounds.set(f27, f28, this.f47961i + f27, this.f47960h + f28);
                        } else {
                            if (!a(x13, y13)) {
                                this.f47973u = f.DRAG_GENERIC;
                                minBounds.set(maxBounds);
                                return false;
                            }
                            z();
                            l();
                        }
                    }
                }
            }
            ib2.d dVar5 = this.f47975w;
            if (dVar5 != null) {
                Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                dVar5.O2(cropperBounds);
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        q();
                    }
                    return true;
                }
                f fVar = this.f47973u;
                if (fVar == f.DRAG_GENERIC || fVar == f.DRAG_UNKNOWN) {
                    return false;
                }
                float rawX = motionEvent.getRawX() + this.f47955c;
                float rawY = motionEvent.getRawY() + this.f47956d;
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                z();
                f fVar2 = this.f47973u;
                switch (fVar2 == null ? -1 : g.f48028a[fVar2.ordinal()]) {
                    case 1:
                        float f29 = rawX - this.f47957e;
                        float f33 = rawY - this.f47958f;
                        float f34 = this.f47962j;
                        RectF j13 = j(rawX, rawY, f29, f33, f34, f34);
                        float min = Math.min(j13.left, minBounds.left);
                        float min2 = Math.min(j13.top, minBounds.top);
                        i iVar2 = this.f48031z;
                        if (iVar2 != null) {
                            RectF rectF = this.f47965m;
                            Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(maxBounds, "getMaxBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(minBounds, "getMinBounds(...)");
                            l lVar2 = (l) iVar2;
                            Intrinsics.checkNotNullParameter(cropperBounds, "cropperBounds");
                            Intrinsics.checkNotNullParameter(maxBounds, "maxBounds");
                            Intrinsics.checkNotNullParameter(minBounds, "minBounds");
                            if (rectF != null) {
                                float f35 = rawX - lVar2.f48036e;
                                float f36 = rawY - lVar2.f48037f;
                                int i13 = lVar2.f48033b;
                                float f37 = i13;
                                if (f35 > f37) {
                                    f35 = 0.0f;
                                }
                                if (f36 > f37) {
                                    f36 = 0.0f;
                                }
                                boolean z13 = min >= rectF.left && min2 >= rectF.top;
                                float f38 = maxBounds.left;
                                lVar2.p3(f35, f36, rawX2, rawY2, min <= f38 && min2 <= maxBounds.top, min <= f38 + ((float) i13) && min2 <= maxBounds.top + ((float) i13), z13, f35 < f37 && f36 < f37);
                                ((h) ((j) lVar2.getView())).C(min, min2);
                                if (lVar2.f48038g && (lVar2.f48034c <= lVar2.f48035d || lVar2.f48039h)) {
                                    j jVar = (j) lVar2.getView();
                                    float f39 = lVar2.f48032a;
                                    ((h) jVar).D(f39, f39);
                                    if (rectF.left <= cropperBounds.left || f35 >= 0.0f || rectF.top <= cropperBounds.top || f36 >= 0.0f) {
                                        lVar2.f48038g = false;
                                    }
                                }
                                lVar2.f48036e = rawX;
                                lVar2.f48037f = rawY;
                                break;
                            } else {
                                ((h) ((j) lVar2.getView())).C(min, min2);
                                break;
                            }
                        }
                        break;
                    case 2:
                        float f41 = this.f47957e;
                        float f43 = rawY - this.f47958f;
                        float f44 = this.f47962j;
                        RectF j14 = j(f41, rawY, f41 - rawX, f43, f44, f44);
                        float f45 = j14.right;
                        float min3 = Math.min(j14.top, minBounds.top);
                        i iVar3 = this.f48031z;
                        if (iVar3 != null) {
                            RectF rectF2 = this.f47965m;
                            Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(maxBounds, "getMaxBounds(...)");
                            l lVar3 = (l) iVar3;
                            Intrinsics.checkNotNullParameter(cropperBounds, "cropperBounds");
                            Intrinsics.checkNotNullParameter(maxBounds, "maxBounds");
                            if (rectF2 != null) {
                                float f46 = rawX - lVar3.f48036e;
                                float f47 = rawY - lVar3.f48037f;
                                int i14 = lVar3.f48033b;
                                float f48 = -i14;
                                if (f46 < f48) {
                                    f46 = 0.0f;
                                }
                                float f49 = i14;
                                if (f47 > f49) {
                                    f47 = 0.0f;
                                }
                                boolean z14 = f45 <= rectF2.right && min3 >= rectF2.top;
                                float f53 = maxBounds.right;
                                lVar3.p3(f46, f47, rawX2, rawY2, f45 >= f53 && min3 <= maxBounds.top, f45 >= f53 - ((float) i14) && min3 <= maxBounds.top + ((float) i14), z14, f46 > f48 && f47 < f49);
                                ((h) ((j) lVar3.getView())).C(f45, min3);
                                if (lVar3.f48038g && (lVar3.f48034c <= lVar3.f48035d || lVar3.f48039h)) {
                                    j jVar2 = (j) lVar3.getView();
                                    float f54 = lVar3.f48032a;
                                    ((h) jVar2).D(-f54, f54);
                                    if (rectF2.right >= cropperBounds.right || f46 <= 0.0f || rectF2.top <= cropperBounds.top || f47 >= 0.0f) {
                                        lVar3.f48038g = false;
                                    }
                                }
                                lVar3.f48036e = rawX;
                                lVar3.f48037f = rawY;
                                break;
                            } else {
                                ((h) ((j) lVar3.getView())).C(f45, min3);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float f55 = this.f47958f;
                        float f56 = this.f47962j;
                        RectF j15 = j(rawX, f55, rawX - this.f47957e, f55 - rawY, f56, f56);
                        float min4 = Math.min(j15.left, minBounds.left);
                        float f57 = j15.bottom;
                        i iVar4 = this.f48031z;
                        if (iVar4 != null) {
                            RectF rectF3 = this.f47965m;
                            Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(maxBounds, "getMaxBounds(...)");
                            l lVar4 = (l) iVar4;
                            Intrinsics.checkNotNullParameter(cropperBounds, "cropperBounds");
                            Intrinsics.checkNotNullParameter(maxBounds, "maxBounds");
                            if (rectF3 != null) {
                                float f58 = rawX - lVar4.f48036e;
                                float f59 = rawY - lVar4.f48037f;
                                int i15 = lVar4.f48033b;
                                float f63 = i15;
                                if (f58 > f63) {
                                    f58 = 0.0f;
                                }
                                float f64 = -i15;
                                if (f59 < f64) {
                                    f59 = 0.0f;
                                }
                                boolean z15 = min4 >= rectF3.left && f57 <= rectF3.bottom;
                                float f65 = maxBounds.left;
                                lVar4.p3(f58, f59, rawX2, rawY2, min4 <= f65 && f57 >= maxBounds.bottom, min4 <= f65 + ((float) i15) && f57 >= maxBounds.bottom - ((float) i15), z15, f58 < f63 && f59 > f64);
                                ((h) ((j) lVar4.getView())).C(min4, f57);
                                if (lVar4.f48038g && (lVar4.f48034c <= lVar4.f48035d || lVar4.f48039h)) {
                                    j jVar3 = (j) lVar4.getView();
                                    float f66 = lVar4.f48032a;
                                    ((h) jVar3).D(f66, -f66);
                                    if (rectF3.left <= cropperBounds.left || f58 >= 0.0f || rectF3.bottom <= cropperBounds.bottom || f59 <= 0.0f) {
                                        lVar4.f48038g = false;
                                    }
                                }
                                lVar4.f48036e = rawX;
                                lVar4.f48037f = rawY;
                                break;
                            } else {
                                ((h) ((j) lVar4.getView())).C(min4, f57);
                                break;
                            }
                        }
                        break;
                    case 4:
                        float f67 = this.f47957e;
                        float f68 = this.f47958f;
                        float f69 = this.f47962j;
                        RectF j16 = j(f67, f68, f67 - rawX, f68 - rawY, f69, f69);
                        float f73 = j16.right;
                        float f74 = j16.bottom;
                        i iVar5 = this.f48031z;
                        if (iVar5 != null) {
                            RectF rectF4 = this.f47965m;
                            Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(maxBounds, "getMaxBounds(...)");
                            l lVar5 = (l) iVar5;
                            Intrinsics.checkNotNullParameter(cropperBounds, "cropperBounds");
                            Intrinsics.checkNotNullParameter(maxBounds, "maxBounds");
                            if (rectF4 != null) {
                                float f75 = rawX - lVar5.f48036e;
                                float f76 = rawY - lVar5.f48037f;
                                int i16 = lVar5.f48033b;
                                float f77 = -i16;
                                if (f75 > f77) {
                                    f75 = 0.0f;
                                }
                                if (f76 > f77) {
                                    f76 = 0.0f;
                                }
                                boolean z16 = f73 <= rectF4.right && f74 <= rectF4.bottom;
                                float f78 = maxBounds.right;
                                lVar5.p3(f75, f76, rawX2, rawY2, f73 >= f78 && f74 >= maxBounds.bottom, f73 >= f78 - ((float) i16) && f74 >= maxBounds.bottom - ((float) i16), z16, f75 > f77 && f76 > f77);
                                ((h) ((j) lVar5.getView())).C(f73, f74);
                                if (lVar5.f48038g && (lVar5.f48034c <= lVar5.f48035d || lVar5.f48039h)) {
                                    float f79 = -lVar5.f48032a;
                                    ((h) ((j) lVar5.getView())).D(f79, f79);
                                    if (rectF4.bottom <= cropperBounds.bottom || f76 <= 0.0f || rectF4.right <= cropperBounds.right || f75 <= 0.0f) {
                                        lVar5.f48038g = false;
                                    }
                                }
                                lVar5.f48036e = rawX;
                                lVar5.f48037f = rawY;
                                break;
                            } else {
                                ((h) ((j) lVar5.getView())).C(f73, f74);
                                break;
                            }
                        }
                        break;
                    case 5:
                        float max = Math.max(Math.min(rawY, minBounds.top), maxBounds.top);
                        i iVar6 = this.f48031z;
                        if (iVar6 != null) {
                            RectF rectF5 = this.f47965m;
                            Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(maxBounds, "getMaxBounds(...)");
                            l lVar6 = (l) iVar6;
                            Intrinsics.checkNotNullParameter(cropperBounds, "cropperBounds");
                            Intrinsics.checkNotNullParameter(maxBounds, "maxBounds");
                            if (rectF5 == null) {
                                ((h) ((j) lVar6.getView())).C(0.0f, max);
                            } else {
                                float f83 = rawX - lVar6.f48037f;
                                int i17 = lVar6.f48033b;
                                float f84 = i17;
                                if (f83 > f84) {
                                    f83 = 0.0f;
                                }
                                boolean z17 = max >= rectF5.top;
                                float f85 = maxBounds.top;
                                lVar6.p3(0.0f, f83, rawX2, rawY2, max <= f85, max <= f85 + ((float) i17), z17, f83 < f84);
                                ((h) ((j) lVar6.getView())).C(0.0f, max);
                                if (lVar6.f48038g && (lVar6.f48034c <= lVar6.f48035d || lVar6.f48039h)) {
                                    ((h) ((j) lVar6.getView())).D(0.0f, lVar6.f48032a);
                                    if (rectF5.top >= cropperBounds.top || f83 >= 0.0f) {
                                        lVar6.f48038g = false;
                                    }
                                }
                                lVar6.f48037f = rawX;
                            }
                        }
                        break;
                    case 6:
                        float max2 = Math.max(Math.min(rawX, minBounds.left), maxBounds.left);
                        i iVar7 = this.f48031z;
                        if (iVar7 != null) {
                            RectF rectF6 = this.f47965m;
                            Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(maxBounds, "getMaxBounds(...)");
                            l lVar7 = (l) iVar7;
                            Intrinsics.checkNotNullParameter(cropperBounds, "cropperBounds");
                            Intrinsics.checkNotNullParameter(maxBounds, "maxBounds");
                            if (rectF6 == null) {
                                ((h) ((j) lVar7.getView())).C(max2, 0.0f);
                            } else {
                                float f86 = rawX - lVar7.f48036e;
                                int i18 = lVar7.f48033b;
                                float f87 = i18;
                                if (f86 > f87) {
                                    f86 = 0.0f;
                                }
                                boolean z18 = max2 >= rectF6.left;
                                float f88 = maxBounds.left;
                                lVar7.p3(f86, 0.0f, rawX2, rawY2, max2 <= f88, max2 <= f88 + ((float) i18), z18, f86 < f87);
                                ((h) ((j) lVar7.getView())).C(max2, 0.0f);
                                if (lVar7.f48038g && (lVar7.f48034c <= lVar7.f48035d || lVar7.f48039h)) {
                                    ((h) ((j) lVar7.getView())).D(lVar7.f48032a, 0.0f);
                                    if (rectF6.left >= cropperBounds.left || f86 >= 0.0f) {
                                        lVar7.f48038g = false;
                                    }
                                }
                                lVar7.f48036e = rawX;
                            }
                        }
                        break;
                    case 7:
                        float f89 = maxBounds.right;
                        float f93 = this.f47957e;
                        float min5 = Math.min(f89, Math.max(this.f47959g - (f93 - rawX), this.f47962j) + f93);
                        i iVar8 = this.f48031z;
                        if (iVar8 != null) {
                            RectF rectF7 = this.f47965m;
                            Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(maxBounds, "getMaxBounds(...)");
                            l lVar8 = (l) iVar8;
                            Intrinsics.checkNotNullParameter(cropperBounds, "cropperBounds");
                            Intrinsics.checkNotNullParameter(maxBounds, "maxBounds");
                            if (rectF7 == null) {
                                ((h) ((j) lVar8.getView())).C(min5, 0.0f);
                            } else {
                                float f94 = rawX - lVar8.f48036e;
                                int i19 = lVar8.f48033b;
                                float f95 = -i19;
                                if (f94 < f95) {
                                    f94 = 0.0f;
                                }
                                boolean z19 = min5 < rectF7.right;
                                float f96 = maxBounds.right;
                                lVar8.p3(f94, 0.0f, rawX2, rawY2, min5 >= f96, min5 >= f96 - ((float) i19), z19, f94 > f95);
                                ((h) ((j) lVar8.getView())).C(min5, 0.0f);
                                if (lVar8.f48038g && (lVar8.f48034c <= lVar8.f48035d || lVar8.f48039h)) {
                                    ((h) ((j) lVar8.getView())).D(-lVar8.f48032a, 0.0f);
                                    if (rectF7.right <= cropperBounds.right || f94 <= 0.0f) {
                                        lVar8.f48038g = false;
                                    }
                                }
                                lVar8.f48036e = rawX;
                            }
                        }
                        break;
                    case 8:
                        float f97 = maxBounds.bottom;
                        float f98 = this.f47958f;
                        float min6 = Math.min(f97, Math.max(this.f47960h - (f98 - rawY), this.f47962j) + f98);
                        i iVar9 = this.f48031z;
                        if (iVar9 != null) {
                            RectF rectF8 = this.f47965m;
                            Intrinsics.checkNotNullExpressionValue(cropperBounds, "getCropperBounds(...)");
                            Intrinsics.checkNotNullExpressionValue(maxBounds, "getMaxBounds(...)");
                            l lVar9 = (l) iVar9;
                            Intrinsics.checkNotNullParameter(cropperBounds, "cropperBounds");
                            Intrinsics.checkNotNullParameter(maxBounds, "maxBounds");
                            if (rectF8 == null) {
                                ((h) ((j) lVar9.getView())).C(0.0f, min6);
                            } else {
                                float f99 = rawY - lVar9.f48037f;
                                int i23 = lVar9.f48033b;
                                float f100 = -i23;
                                if (f99 < f100) {
                                    f99 = 0.0f;
                                }
                                boolean z23 = min6 < rectF8.bottom;
                                float f101 = maxBounds.bottom;
                                lVar9.p3(0.0f, f99, rawX2, rawY2, min6 >= f101, min6 >= f101 - ((float) i23), z23, f99 > f100);
                                ((h) ((j) lVar9.getView())).C(0.0f, min6);
                                if (lVar9.f48038g && (lVar9.f48034c <= lVar9.f48035d || lVar9.f48039h)) {
                                    ((h) ((j) lVar9.getView())).D(0.0f, -lVar9.f48032a);
                                    if (rectF8.bottom <= cropperBounds.bottom || f99 <= 0.0f) {
                                        lVar9.f48038g = false;
                                    }
                                }
                                lVar9.f48037f = rawY;
                            }
                        }
                        break;
                }
                return true;
            }
            q();
        }
        return true;
    }

    @Override // com.pinterest.feature.search.visual.cropper.FlashlightCropperView
    public final void q() {
        super.q();
        i iVar = this.f48031z;
        if (iVar != null) {
            l lVar = (l) iVar;
            lVar.f48036e = 0.0f;
            lVar.f48037f = 0.0f;
            lVar.f48038g = false;
            lVar.f48039h = false;
        }
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }

    public final void z() {
        getParent().requestDisallowInterceptTouchEvent(true);
    }
}
