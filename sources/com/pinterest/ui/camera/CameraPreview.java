package com.pinterest.ui.camera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fa2.c;
import fa2.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.quikkly.android.ui.CameraPreview;
import tb0.g;
import tb0.h;

/* loaded from: classes4.dex */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceHolder f52241a;

    /* renamed from: b, reason: collision with root package name */
    public Camera f52242b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f52243c;

    /* renamed from: d, reason: collision with root package name */
    public int f52244d;

    /* renamed from: e, reason: collision with root package name */
    public CameraPreview.PreviewListener f52245e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52246f;

    /* renamed from: g, reason: collision with root package name */
    public final d f52247g;

    public CameraPreview(Context context) {
        super(context);
        this.f52246f = true;
        this.f52247g = new d(this);
        b();
    }

    public static void a(FrameLayout frameLayout) {
        int i13 = frameLayout.getResources().getDisplayMetrics().widthPixels;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = (i13 / 3) * 4;
        layoutParams.width = i13;
        frameLayout.setLayoutParams(layoutParams);
    }

    public final void b() {
        SurfaceHolder holder = getHolder();
        this.f52241a = holder;
        holder.addCallback(this);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f52241a.setType(3);
    }

    public final boolean c() {
        return this.f52243c;
    }

    public final void d(boolean z13) {
        this.f52243c = z13;
    }

    public final void e() {
        Camera camera;
        if (this.f52245e == null || (camera = this.f52242b) == null) {
            return;
        }
        try {
            camera.setPreviewDisplay(this.f52241a);
        } catch (IOException e13) {
            HashSet hashSet = h.f117076w;
            g.f117075a.p(e13);
        }
        this.f52245e.onPreviewReady(true, this.f52242b.getParameters().getPreviewSize());
        this.f52242b.setPreviewCallbackWithBuffer(this.f52247g);
        this.f52243c = true;
        this.f52242b.startPreview();
    }

    public final void f() {
        Camera camera = this.f52242b;
        if (camera != null) {
            List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            this.f52242b.setDisplayOrientation(90);
            try {
                this.f52242b.setPreviewCallbackWithBuffer(this.f52247g);
                this.f52242b.setPreviewDisplay(this.f52241a);
            } catch (IOException e13) {
                HashSet hashSet = h.f117076w;
                g.f117075a.p(e13);
            }
            Camera.Parameters parameters = this.f52242b.getParameters();
            int width = getWidth();
            double height = getHeight() / width;
            Camera.Size size = null;
            if (supportedPreviewSizes != null) {
                double d2 = Double.MAX_VALUE;
                for (Camera.Size size2 : supportedPreviewSizes) {
                    if (Math.abs((size2.width / size2.height) - height) <= 0.05d && Math.abs(size2.width - width) < d2) {
                        d2 = Math.abs(size2.width - width);
                        size = size2;
                    }
                }
                if (size == null) {
                    double d13 = Double.MAX_VALUE;
                    for (Camera.Size size3 : supportedPreviewSizes) {
                        if (Math.abs(size3.width - width) < d13) {
                            d13 = Math.abs(size3.width - width);
                            size = size3;
                        }
                    }
                }
            }
            if (size != null) {
                parameters.setPreviewSize(size.width, size.height);
            }
            if (!c.f61599g) {
                this.f52242b.setParameters(parameters);
            }
            this.f52242b.startPreview();
            this.f52243c = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Camera.Parameters parameters;
        Camera.Parameters parameters2;
        int maxNumMeteringAreas;
        if (!this.f52246f) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (this.f52242b != null) {
                Camera camera = c.f61593a;
                float x13 = motionEvent.getX();
                float y13 = motionEvent.getY();
                float width = (getWidth() * 0.18f) / 2.0f;
                Rect rect = new Rect((int) (x13 - width), (int) (y13 - width), (int) (x13 + width), (int) (width + y13));
                int height = (int) (getHeight() * 0.2f);
                float width2 = (int) (getWidth() * 0.2f);
                if (x13 >= width2 && getWidth() - r1 >= x13 && y13 >= width2 && getHeight() - height >= y13) {
                    Rect rect2 = new Rect(((rect.left * 2000) / getWidth()) - 1000, ((rect.top * 2000) / getHeight()) - 1000, ((rect.right * 2000) / getWidth()) - 1000, ((rect.bottom * 2000) / getHeight()) - 1000);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(rect2, 1000));
                    Camera camera2 = c.f61593a;
                    if (camera2 != null && !c.f61601i && (maxNumMeteringAreas = (parameters2 = camera2.getParameters()).getMaxNumMeteringAreas()) > 0 && arrayList.size() <= maxNumMeteringAreas) {
                        parameters2.setMeteringAreas(arrayList);
                        c.f61593a.setParameters(parameters2);
                    }
                }
            }
        } else if (motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 2) {
            Camera camera3 = this.f52242b;
            if (camera3 != null && camera3.getParameters().isZoomSupported()) {
                Camera.Parameters parameters3 = c.f61594b;
                int maxZoom = parameters3 != null ? parameters3.getMaxZoom() : 0;
                Camera.Parameters parameters4 = c.f61594b;
                int zoom = parameters4 != null ? parameters4.getZoom() : 0;
                float x14 = motionEvent.getX(0) - motionEvent.getX(1);
                float y14 = motionEvent.getY(0) - motionEvent.getY(1);
                float sqrt = (float) Math.sqrt((y14 * y14) + (x14 * x14));
                float f13 = c.f61596d;
                if (sqrt > f13) {
                    if (zoom < maxZoom) {
                        zoom++;
                    }
                } else if (sqrt < f13 && zoom > 0) {
                    zoom--;
                }
                c.f61596d = sqrt;
                if (c.f61593a != null && (parameters = c.f61594b) != null) {
                    parameters.setZoom(zoom);
                    c.f61593a.setParameters(c.f61594b);
                }
            }
        } else {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            try {
                Camera camera4 = c.f61593a;
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
        if (this.f52241a.getSurface() == null) {
            return;
        }
        try {
            this.f52243c = false;
            Camera camera = this.f52242b;
            if (camera != null) {
                camera.stopPreview();
            }
        } catch (Exception unused) {
            Log.v("CameraPreview", "Tried to stop a non-existent preview");
        }
        try {
            if (this.f52242b == null && this.f52244d == 0) {
                return;
            }
            f();
            c.k(this.f52244d, c.f61593a);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f52241a = surfaceHolder;
        try {
            if (this.f52242b == null || !c.f61600h) {
                return;
            }
            c.e();
            this.f52242b.setPreviewDisplay(this.f52241a);
            this.f52242b.startPreview();
            this.f52243c = true;
        } catch (IOException e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        c.d(this);
        CameraPreview.PreviewListener previewListener = this.f52245e;
        if (previewListener != null) {
            previewListener.onPreviewReady(false, null);
        }
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52246f = true;
        this.f52247g = new d(this);
        b();
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f52246f = true;
        this.f52247g = new d(this);
        b();
    }
}
