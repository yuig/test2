package net.quikkly.android.render;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
import net.quikkly.android.utils.BitmapUtils;
import net.quikkly.core.SkinBuilder;

/* loaded from: classes4.dex */
public class AndroidSkinBuilder extends SkinBuilder {
    public AndroidSkinBuilder setAssetsImage(Context context, String str) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str, 2);
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        try {
            setImageStream(inputStream, str);
            if (inputStream != null) {
                inputStream.close();
            }
            return this;
        } catch (Throwable th4) {
            th = th4;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public AndroidSkinBuilder setAssetsLogo(Context context, String str) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str, 2);
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        try {
            setLogoStream(inputStream, str);
            if (inputStream != null) {
                inputStream.close();
            }
            return this;
        } catch (Throwable th4) {
            th = th4;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setBackgroundColor(String str) {
        return (AndroidSkinBuilder) super.setBackgroundColor(str);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setBorderColor(String str) {
        return (AndroidSkinBuilder) super.setBorderColor(str);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setDataColors(String[] strArr) {
        return (AndroidSkinBuilder) super.setDataColors(strArr);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setDotJoin(int i13) {
        return (AndroidSkinBuilder) super.setDotJoin(i13);
    }

    public AndroidSkinBuilder setImage(Bitmap bitmap) {
        setImageUrl(BitmapUtils.bitmapToDataUri(bitmap));
        return this;
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setImageFit(int i13) {
        return (AndroidSkinBuilder) super.setImageFit(i13);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setImageUrl(String str) {
        return (AndroidSkinBuilder) super.setImageUrl(str);
    }

    public AndroidSkinBuilder setLogo(Bitmap bitmap) {
        setLogoUrl(BitmapUtils.bitmapToDataUri(bitmap));
        return this;
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setLogoFit(int i13) {
        return (AndroidSkinBuilder) super.setLogoFit(i13);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setLogoUrl(String str) {
        return (AndroidSkinBuilder) super.setLogoUrl(str);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setMaskColor(String str) {
        return (AndroidSkinBuilder) super.setMaskColor(str);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setOverlayColor(String str) {
        return (AndroidSkinBuilder) super.setOverlayColor(str);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setImage(File file) {
        return (AndroidSkinBuilder) super.setImage(file);
    }

    @Override // net.quikkly.core.SkinBuilder
    public AndroidSkinBuilder setLogo(File file) {
        return (AndroidSkinBuilder) super.setLogo(file);
    }
}
