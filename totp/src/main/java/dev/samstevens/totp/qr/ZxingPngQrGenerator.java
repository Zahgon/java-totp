package dev.samstevens.totp.qr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import dev.samstevens.totp.exceptions.QrGenerationException;
import java.io.ByteArrayOutputStream;

public class ZxingPngQrGenerator implements QrGenerator {

    private final Writer writer;

    private int imageSize = 350;

    public ZxingPngQrGenerator() {
        this(new QRCodeWriter());
    }

    public ZxingPngQrGenerator(Writer writer) {
        this.writer = writer;
    }

    public void setImageSize(int imageSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getImageSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getImageMimeType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] generate(QrData data) throws QrGenerationException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
