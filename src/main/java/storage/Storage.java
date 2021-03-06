package storage;

import entity.Detail;

import java.util.ArrayList;
import java.util.List;

import static factory.CarAssembly.logger;

public class Storage {
    List<Detail> engine;
    List<Detail> carriage;
    List<Detail> body;

    public Storage() {
        engine = new ArrayList<Detail>();
        carriage = new ArrayList<Detail>();
        body = new ArrayList<Detail>();
    }

    public List<Detail> getEngine() {
        return engine;
    }

    public List<Detail> getCarriage() {
        return carriage;
    }

    public List<Detail> getBody() {
        return body;
    }

    public List<Detail> engineStorage() {
        logger.debug("Engine storage is getting supplies");
        for (int i = 0; i < (int) (Math.random() * 75); i++) {
            if (Math.random() > 0.5) {
                engine.add(Detail.POLO_ENGINE);
                logger.trace("Polo engine added");
            } else {
                engine.add(Detail.JETTA_ENGINE);
                logger.trace("Jetta engine added");
            }
        }
        logger.debug("Engine storage got " + engine.size() + " units");
        return engine;
    }

    public List<Detail> carriageStorage() {
        logger.debug("Carriage storage is getting supplies");
        for (int i = 0; i < (int) (Math.random() * 75); i++) {
            if (Math.random() > 0.5) {
                carriage.add(Detail.POLO_CARRIAGE);
                logger.trace("Polo carriage added");
            } else {
                carriage.add(Detail.JETTA_CARRIAGE);
                logger.trace("Jetta carriage added");
            }
        }
        logger.debug("Carriage storage got " + engine.size() + " units");
        return carriage;
    }

    public List<Detail> bodyStorage() {
        logger.debug("Body storage is getting supplies");
        for (int i = 0; i < (int) (Math.random() * 75); i++) {
            if (Math.random() > 0.5) {
                body.add(Detail.POLO_BODY);
                logger.trace("Polo body added");
            } else {
                body.add(Detail.JETTA_BODY);
                logger.trace("Jetta body added");
            }
        }
        logger.debug("Body storage got " + engine.size() + " units");
        return body;
    }
}