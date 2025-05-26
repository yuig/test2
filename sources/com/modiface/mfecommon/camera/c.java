package com.modiface.mfecommon.camera;

import android.hardware.Camera;
import com.modiface.mfecommon.camera.MFEAndroidCameraParameters;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class c {
    public static Integer a(boolean z13) {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i13 = 0; i13 < numberOfCameras; i13++) {
            Camera.getCameraInfo(i13, cameraInfo);
            if (cameraInfo.facing == z13) {
                return Integer.valueOf(i13);
            }
        }
        return null;
    }

    public static b a(boolean z13, int i13, MFEAndroidCameraParameters.CameraRotation cameraRotation) {
        int i14;
        b bVar = z13 ? b.ROTATE270_FLIP : b.ROTATE0_NOFLIP;
        if (cameraRotation == null) {
            cameraRotation = MFEAndroidCameraParameters.CameraRotation.ROTATE_0;
        }
        try {
            Integer a13 = a(z13);
            if (a13 == null) {
                return bVar;
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(a13.intValue(), cameraInfo);
            if (cameraInfo.facing == 1) {
                i14 = (cameraInfo.orientation + i13) % 360;
            } else {
                i14 = ((360 - cameraInfo.orientation) + i13) % 360;
            }
            int i15 = q.f34243a[cameraRotation.ordinal()];
            if (i15 == 1) {
                i14 = (i14 + 90) % 360;
            } else if (i15 == 2) {
                i14 = (i14 + RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP) % 360;
            } else if (i15 == 3) {
                i14 = (i14 + RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF) % 360;
            }
            if (cameraInfo.facing == 1) {
                if (i14 == 0) {
                    return b.ROTATE0_FLIP;
                }
                if (i14 == 90) {
                    return b.ROTATE90_FLIP;
                }
                if (i14 == 180) {
                    return b.ROTATE180_FLIP;
                }
                if (i14 != 270) {
                    return b.ROTATE270_FLIP;
                }
                return b.ROTATE270_FLIP;
            }
            if (i14 == 0) {
                return b.ROTATE0_NOFLIP;
            }
            if (i14 == 90) {
                return b.ROTATE90_NOFLIP;
            }
            if (i14 == 180) {
                return b.ROTATE180_NOFLIP;
            }
            if (i14 != 270) {
                return b.ROTATE0_NOFLIP;
            }
            return b.ROTATE270_NOFLIP;
        } catch (Exception unused) {
            if (z13) {
                return b.ROTATE270_FLIP;
            }
            return b.ROTATE0_NOFLIP;
        }
    }

    public static Camera.Size a(int i13, int i14, int i15, Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes;
        Camera.Size size;
        Iterator<Camera.Size> it;
        int i16;
        int i17;
        int i18 = i13;
        int i19 = i14;
        boolean z13 = i18 <= 0 || i19 <= 0;
        if (i15 > 0 && !z13) {
            if (i18 > i19) {
                if (i18 > i15) {
                    i19 = (int) ((i19 / i18) * i15);
                    i18 = i15;
                }
            } else if (i19 > i15) {
                i18 = (int) ((i18 / i19) * i15);
                i19 = i15;
            }
        }
        double d2 = i18;
        double max = d2 / Math.max(1, i19);
        Camera.Size size2 = null;
        if (parameters != null && (supportedPreviewSizes = parameters.getSupportedPreviewSizes()) != null) {
            Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
            double d13 = Double.MAX_VALUE;
            while (it2.hasNext()) {
                Camera.Size next = it2.next();
                if (next == null || (i16 = next.width) <= 0 || (i17 = next.height) <= 0) {
                    size = size2;
                    it = it2;
                } else {
                    size = size2;
                    it = it2;
                    double abs = z13 ? 1.0d / (i16 * i17) : (Math.abs((i16 / i17) - max) / max) + Math.abs((next.width - i18) / d2) + Math.abs((next.height - i19) / i19);
                    if (next.width % 4 == 0 && next.height % 4 == 0 && abs < d13) {
                        it2 = it;
                        size2 = next;
                        d13 = abs;
                    }
                }
                it2 = it;
                size2 = size;
            }
        }
        return size2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix a(com.modiface.mfecommon.camera.b r6) {
        /*
            if (r6 != 0) goto L4
            com.modiface.mfecommon.camera.b r6 = com.modiface.mfecommon.camera.b.ROTATE0_NOFLIP
        L4:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int[] r1 = com.modiface.mfecommon.camera.q.f34244b
            int r6 = r6.ordinal()
            r6 = r1[r6]
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2 = -1020002304(0xffffffffc3340000, float:-180.0)
            r3 = -1014562816(0xffffffffc3870000, float:-270.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r6) {
                case 1: goto L40;
                case 2: goto L3c;
                case 3: goto L35;
                case 4: goto L31;
                case 5: goto L2a;
                case 6: goto L26;
                case 7: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L43
        L1f:
            r0.postScale(r5, r4)
            r0.postRotate(r3)
            goto L43
        L26:
            r0.postRotate(r3)
            goto L43
        L2a:
            r0.postScale(r5, r4)
            r0.postRotate(r2)
            goto L43
        L31:
            r0.postRotate(r2)
            goto L43
        L35:
            r0.postScale(r5, r4)
            r0.postRotate(r1)
            goto L43
        L3c:
            r0.postRotate(r1)
            goto L43
        L40:
            r0.postScale(r5, r4)
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfecommon.camera.c.a(com.modiface.mfecommon.camera.b):android.graphics.Matrix");
    }
}
