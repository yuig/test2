package cr;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCameraToggle;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import tt0.l0;

/* loaded from: classes3.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53061a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53063c;

    public a(b bVar, Context context) {
        this.f53063c = bVar;
        this.f53062b = context;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i13 = this.f53061a;
        Object obj = this.f53063c;
        Object obj2 = this.f53062b;
        switch (i13) {
            case 0:
                int action = motionEvent.getAction();
                if (action == 0) {
                    FrameLayout frameLayout = (FrameLayout) ((b) obj).f53067f;
                    int i14 = k42.a.gray_lightest_transparent;
                    Object obj3 = d5.a.f53679a;
                    frameLayout.setBackgroundColor(((Context) obj2).getColor(i14));
                    return true;
                }
                if (action != 1) {
                    return false;
                }
                b bVar = (b) obj;
                FrameLayout frameLayout2 = (FrameLayout) bVar.f53067f;
                int i15 = eo1.b.color_themed_transparent;
                Object obj4 = d5.a.f53679a;
                frameLayout2.setBackgroundColor(((Context) obj2).getColor(i15));
                bVar.a();
                return true;
            default:
                if (motionEvent != null) {
                    h0 h0Var = (h0) obj2;
                    l0 l0Var = (l0) obj;
                    int action2 = motionEvent.getAction();
                    if (action2 == 0) {
                        h0Var.f80426a = (int) motionEvent.getRawX();
                        return true;
                    }
                    if (action2 == 1) {
                        IdeaPinCameraToggle ideaPinCameraToggle = l0Var.E0;
                        if (ideaPinCameraToggle == null) {
                            Intrinsics.r("toggleView");
                            throw null;
                        }
                        int rawX = (int) motionEvent.getRawX();
                        boolean z13 = ideaPinCameraToggle.f45913h;
                        uk2.f fVar = ideaPinCameraToggle.f45912g;
                        if (z13) {
                            ideaPinCameraToggle.f45913h = false;
                            if (!ideaPinCameraToggle.a()) {
                                ideaPinCameraToggle.c();
                                ideaPinCameraToggle.d();
                                return true;
                            }
                            ideaPinCameraToggle.b();
                            Pair pair = ideaPinCameraToggle.f45910e;
                            if (pair == null) {
                                return true;
                            }
                            ideaPinCameraToggle.setX(((Number) pair.f80346a).floatValue());
                            fVar.c(rt0.a.PHOTO);
                            return true;
                        }
                        int[] iArr = new int[2];
                        FrameLayout frameLayout3 = ideaPinCameraToggle.f45909d;
                        if (frameLayout3 == null) {
                            Intrinsics.r("photoTextViewContainer");
                            throw null;
                        }
                        frameLayout3.getLocationOnScreen(iArr);
                        int i16 = iArr[0];
                        if (rawX >= i16) {
                            FrameLayout frameLayout4 = ideaPinCameraToggle.f45909d;
                            if (frameLayout4 == null) {
                                Intrinsics.r("photoTextViewContainer");
                                throw null;
                            }
                            if (rawX <= frameLayout4.getWidth() + i16) {
                                ideaPinCameraToggle.b();
                                Pair pair2 = ideaPinCameraToggle.f45910e;
                                if (pair2 == null) {
                                    return true;
                                }
                                ideaPinCameraToggle.setX(((Number) pair2.f80346a).floatValue());
                                fVar.c(rt0.a.PHOTO);
                                return true;
                            }
                        }
                        ideaPinCameraToggle.c();
                        ideaPinCameraToggle.d();
                        return true;
                    }
                    if (action2 == 2) {
                        int rawX2 = ((int) motionEvent.getRawX()) - h0Var.f80426a;
                        IdeaPinCameraToggle ideaPinCameraToggle2 = l0Var.E0;
                        if (ideaPinCameraToggle2 == null) {
                            Intrinsics.r("toggleView");
                            throw null;
                        }
                        if (rawX2 != 0) {
                            ideaPinCameraToggle2.f45913h = true;
                        }
                        Pair pair3 = ideaPinCameraToggle2.f45910e;
                        if (pair3 != null) {
                            float f13 = rawX2;
                            float x13 = ideaPinCameraToggle2.getX() + f13;
                            if (x13 >= ((Number) pair3.f80346a).floatValue() && x13 <= ((Number) pair3.f80347b).floatValue()) {
                                ideaPinCameraToggle2.setX(ideaPinCameraToggle2.getX() + f13);
                                if (ideaPinCameraToggle2.a()) {
                                    ideaPinCameraToggle2.b();
                                } else {
                                    Float f14 = ideaPinCameraToggle2.f45911f;
                                    if (f14 != null) {
                                        float floatValue = f14.floatValue();
                                        int[] iArr2 = new int[2];
                                        FrameLayout frameLayout5 = ideaPinCameraToggle2.f45908c;
                                        if (frameLayout5 == null) {
                                            Intrinsics.r("videoTextViewContainer");
                                            throw null;
                                        }
                                        frameLayout5.getLocationOnScreen(iArr2);
                                        if (floatValue >= iArr2[0]) {
                                            if (ideaPinCameraToggle2.f45908c == null) {
                                                Intrinsics.r("videoTextViewContainer");
                                                throw null;
                                            }
                                            if (floatValue <= r5.getWidth() + r0) {
                                                ideaPinCameraToggle2.c();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        h0Var.f80426a = (int) motionEvent.getRawX();
                    }
                }
                return false;
        }
    }

    public a(h0 h0Var, l0 l0Var) {
        this.f53062b = h0Var;
        this.f53063c = l0Var;
    }
}
