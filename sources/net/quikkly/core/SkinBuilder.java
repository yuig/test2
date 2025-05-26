package net.quikkly.core;

import a.cb;
import ap2.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

/* loaded from: classes4.dex */
public class SkinBuilder {
    public static final Pattern HEX_COLOR_PATTERN = Pattern.compile("^#[0-9a-fA-F]{6}$");
    private Skin skin = new Skin();

    private void checkColor(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Color string is null.");
        }
        if (!HEX_COLOR_PATTERN.matcher(str).matches()) {
            throw new IllegalArgumentException("Color strings must match regex #[0-9a-fA-F]{6}");
        }
    }

    public Skin build() {
        return this.skin;
    }

    public SkinBuilder setBackgroundColor(String str) {
        checkColor(str);
        this.skin.backgroundColor = str;
        return this;
    }

    public SkinBuilder setBorderColor(String str) {
        checkColor(str);
        this.skin.borderColor = str;
        return this;
    }

    public SkinBuilder setDataColors(String[] strArr) {
        if (strArr == null || strArr.length < 1) {
            throw new IllegalArgumentException("Data colors array must not be empty");
        }
        for (String str : strArr) {
            checkColor(str);
        }
        this.skin.dataColors = strArr;
        return this;
    }

    public SkinBuilder setDotJoin(int i13) {
        this.skin.join = i13;
        return this;
    }

    public SkinBuilder setImage(File file) {
        FileInputStream fileInputStream;
        if (file == null) {
            throw new IllegalArgumentException("Image file must not be null.");
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            setImageStream(fileInputStream, file.getAbsolutePath());
            fileInputStream.close();
            return this;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public SkinBuilder setImageFit(int i13) {
        this.skin.imageFit = i13;
        return this;
    }

    public void setImageStream(InputStream inputStream, String str) {
        String str2;
        if (str.toLowerCase().endsWith(".png")) {
            str2 = "image/png";
        } else {
            if (!str.toLowerCase().endsWith(".jpeg") && !str.toLowerCase().endsWith(".jpg")) {
                throw new IllegalArgumentException("Unknown image file extension, cannot determine mime type: ".concat(str));
            }
            str2 = "image/jpeg";
        }
        byte[] b13 = e.b(inputStream);
        StringBuilder o13 = cb.o("data:", str2, ";base64,");
        o13.append(new String(Base64.encodeBase64(b13), "UTF-8"));
        setImageUrl(o13.toString());
    }

    public SkinBuilder setImageUrl(String str) {
        if (StrUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Image URL must not be empty.");
        }
        this.skin.imageUrl = str;
        return this;
    }

    public SkinBuilder setLogo(File file) {
        FileInputStream fileInputStream;
        if (file == null) {
            throw new IllegalArgumentException("Logo file must not be null.");
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            setLogoStream(fileInputStream, file.getAbsolutePath());
            fileInputStream.close();
            return this;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public SkinBuilder setLogoFit(int i13) {
        this.skin.logoFit = i13;
        return this;
    }

    public void setLogoStream(InputStream inputStream, String str) {
        String str2;
        if (str.toLowerCase().endsWith(".png")) {
            str2 = "image/png";
        } else {
            if (!str.toLowerCase().endsWith(".jpeg") && !str.toLowerCase().endsWith(".jpg")) {
                throw new IllegalArgumentException("Unknown logo file extension, cannot determine mime type: ".concat(str));
            }
            str2 = "image/jpeg";
        }
        byte[] b13 = e.b(inputStream);
        StringBuilder o13 = cb.o("data:", str2, ";base64,");
        o13.append(new String(Base64.encodeBase64(b13), "UTF-8"));
        setLogoUrl(o13.toString());
    }

    public SkinBuilder setLogoUrl(String str) {
        if (StrUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Logo URL must not be empty.");
        }
        this.skin.logoUrl = str;
        return this;
    }

    public SkinBuilder setMaskColor(String str) {
        checkColor(str);
        this.skin.maskColor = str;
        return this;
    }

    public SkinBuilder setOverlayColor(String str) {
        checkColor(str);
        this.skin.overlayColor = str;
        return this;
    }
}
