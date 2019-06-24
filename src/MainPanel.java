import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

public class MainPanel extends JPanel {
    BufferedImage bufferedImage;
    BufferedImage bufferedImagebg;
    BufferedImage blackPiece;
    BufferedImage whitePiece;
    int X;
    int Y;

    ArrayList<Piece> Pices = new ArrayList<>();
    ArrayList<Integer>PiecesInPlace = new ArrayList<>();//according to yhe white place numbers
    Map <Integer , BoardCordinates> BlackCordinator = new HashMap<Integer, BoardCordinates>();
    Map <Integer, BoardCordinates> WhiteCordinator = new HashMap<Integer, BoardCordinates>();
    Dice dice;
    public MainPanel() {

        //15 black beads
        Pices.add(new Piece(137, 465,true, "black"));
        Pices.add(new Piece(137, 420,true, "black"));
        Pices.add(new Piece(137, 375,true, "black"));
        Pices.add(new Piece(137, 330,true, "black"));
        Pices.add(new Piece(137, 285,true, "black"));

        Pices.add(new Piece(506, 28, true, "black"));
        Pices.add(new Piece(506, 73, true, "black"));
        Pices.add(new Piece(506, 118,true, "black"));
        Pices.add(new Piece(506, 163,true, "black"));
        Pices.add(new Piece(506, 208,true, "black"));

        Pices.add(new Piece(348, 28,true, "black"));
        Pices.add(new Piece(348, 73,true, "black"));
        Pices.add(new Piece(348, 118,true, "black"));

        Pices.add(new Piece(772, 465,true, "black"));
        Pices.add(new Piece(772, 420,true, "black"));

        //15 white beads
        Pices.add(new Piece(137, 28,true, "white"));
        Pices.add(new Piece(137, 73,true, "white"));
        Pices.add(new Piece(137, 118,true, "white"));
        Pices.add(new Piece(137, 163,true, "white"));
        Pices.add(new Piece(137, 208,true, "white"));

        Pices.add(new Piece(506, 465, true,"white"));
        Pices.add(new Piece(506, 420, true,"white"));
        Pices.add(new Piece(506, 375,true, "white"));
        Pices.add(new Piece(506, 330,true, "white"));
        Pices.add(new Piece(506, 285,true, "white"));

        Pices.add(new Piece(348, 465,true, "white"));
        Pices.add(new Piece(348, 420,true, "white"));
        Pices.add(new Piece(348, 375,true, "white"));

        Pices.add(new Piece(772, 28,true, "white"));
        Pices.add(new Piece(772, 73,true, "white"));


        setLayout(null);
        try {
            bufferedImagebg = ImageIO.read(new File("photos/1.jpg"));
            bufferedImage = ImageIO.read(new File("photos/background.png"));
            blackPiece = ImageIO.read(new File("photos/black_piece.png"));
            whitePiece = ImageIO.read(new File("photos/white_piece.png"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if(dice.getMaxX() > e.getX() & dice.getMinX() < e.getX() & dice.getMaxY() > e.getY() & dice.getMinY() < e.getY()) {
                    dice.randomGenerator();
                    repaint();
                }


            }

            @Override
            public void mousePressed(MouseEvent e) {

                for (Piece piece : Pices) {
                    if(piece.x == e.getX() && piece.y == e.getY()){

                        X = e.getX();
                        Y = e.getY();
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {



                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        dice = new Dice(50 , 700);
    }

    public void takhsismakan() {

        BlackCordinator.put(1, new BoardCordinates());
        BlackCordinator.get(1).XcordinateBegin = 749;
        BlackCordinator.get(1).XcordinateEnd = 795;
        BlackCordinator.get(1).top = true;

        BlackCordinator.put(2, new BoardCordinates());
        BlackCordinator.get(2).XcordinateBegin = 696;
        BlackCordinator.get(2).XcordinateEnd = 742;
        BlackCordinator.get(2).top = true;

        BlackCordinator.put(3, new BoardCordinates());
        BlackCordinator.get(3).XcordinateBegin = 643;
        BlackCordinator.get(3).XcordinateEnd = 689;
        BlackCordinator.get(3).top = true;

        BlackCordinator.put(4, new BoardCordinates());
        BlackCordinator.get(4).XcordinateBegin = 590;
        BlackCordinator.get(4).XcordinateEnd = 636;
        BlackCordinator.get(4).top = true;

        BlackCordinator.put(5, new BoardCordinates());
        BlackCordinator.get(5).XcordinateBegin = 537;
        BlackCordinator.get(5).XcordinateEnd = 583;
        BlackCordinator.get(5).top = true;

        BlackCordinator.put(6, new BoardCordinates());
        BlackCordinator.get(6).XcordinateBegin = 483;
        BlackCordinator.get(6).XcordinateEnd = 529;
        BlackCordinator.get(6).top = true;

        BlackCordinator.put(7, new BoardCordinates());
        BlackCordinator.get(7).XcordinateBegin = 379;
        BlackCordinator.get(7).XcordinateEnd = 425;
        BlackCordinator.get(7).top = true;

        BlackCordinator.put(8, new BoardCordinates());
        BlackCordinator.get(8).XcordinateBegin = 325;
        BlackCordinator.get(8).XcordinateEnd = 371;
        BlackCordinator.get(8).top = true;

        BlackCordinator.put(9, new BoardCordinates());
        BlackCordinator.get(9).XcordinateBegin = 272;
        BlackCordinator.get(9).XcordinateEnd = 318;
        BlackCordinator.get(9).top = true;

        BlackCordinator.put(10, new BoardCordinates());
        BlackCordinator.get(10).XcordinateBegin = 220;
        BlackCordinator.get(10).XcordinateEnd = 266;
        BlackCordinator.get(10).top = true;

        BlackCordinator.put(11, new BoardCordinates());
        BlackCordinator.get(11).XcordinateBegin = 167;
        BlackCordinator.get(11).XcordinateEnd = 213;
        BlackCordinator.get(11).top = true;

        BlackCordinator.put(12, new BoardCordinates());
        BlackCordinator.get(12).XcordinateBegin = 114;
        BlackCordinator.get(12).XcordinateEnd = 160;
        BlackCordinator.get(12).top = true;

        BlackCordinator.put(24, new BoardCordinates());
        BlackCordinator.get(24).XcordinateBegin = 749;
        BlackCordinator.get(24).XcordinateEnd = 795;
        BlackCordinator.get(24).top = false;

        BlackCordinator.put(23, new BoardCordinates());
        BlackCordinator.get(23).XcordinateBegin = 696;
        BlackCordinator.get(23).XcordinateEnd = 742;
        BlackCordinator.get(23).top = false;

        BlackCordinator.put(22, new BoardCordinates());
        BlackCordinator.get(22).XcordinateBegin = 643;
        BlackCordinator.get(22).XcordinateEnd = 689;
        BlackCordinator.get(22).top = false;

        BlackCordinator.put(21, new BoardCordinates());
        BlackCordinator.get(21).XcordinateBegin = 590;
        BlackCordinator.get(21).XcordinateEnd = 636;
        BlackCordinator.get(21).top = false;

        BlackCordinator.put(20, new BoardCordinates());
        BlackCordinator.get(20).XcordinateBegin = 537;
        BlackCordinator.get(20).XcordinateEnd = 583;
        BlackCordinator.get(20).top = false;

        BlackCordinator.put(19, new BoardCordinates());
        BlackCordinator.get(19).XcordinateBegin = 483;
        BlackCordinator.get(19).XcordinateEnd = 529;
        BlackCordinator.get(19).top = false;

        BlackCordinator.put(18, new BoardCordinates());
        BlackCordinator.get(18).XcordinateBegin = 379;
        BlackCordinator.get(18).XcordinateEnd = 425;
        BlackCordinator.get(18).top = false;

        BlackCordinator.put(17, new BoardCordinates());
        BlackCordinator.get(17).XcordinateBegin = 325;
        BlackCordinator.get(17).XcordinateEnd = 371;
        BlackCordinator.get(17).top = false;

        BlackCordinator.put(16, new BoardCordinates());
        BlackCordinator.get(16).XcordinateBegin = 272;
        BlackCordinator.get(16).XcordinateEnd = 318;
        BlackCordinator.get(16).top = false;

        BlackCordinator.put(15, new BoardCordinates());
        BlackCordinator.get(15).XcordinateBegin = 220;
        BlackCordinator.get(15).XcordinateEnd = 266;
        BlackCordinator.get(15).top = false;

        BlackCordinator.put(14, new BoardCordinates());
        BlackCordinator.get(14).XcordinateBegin = 167;
        BlackCordinator.get(14).XcordinateEnd = 213;
        BlackCordinator.get(14).top = false;

        BlackCordinator.put(13, new BoardCordinates());
        BlackCordinator.get(13).XcordinateBegin = 114;
        BlackCordinator.get(13).XcordinateEnd = 160;
        BlackCordinator.get(13).top = false;


        WhiteCordinator.put(1, new BoardCordinates());
        WhiteCordinator.get(1).XcordinateBegin = 749;
        WhiteCordinator.get(1).XcordinateEnd = 795;
        WhiteCordinator.get(1).top = false;

        WhiteCordinator.put(2, new BoardCordinates());
        WhiteCordinator.get(2).XcordinateBegin = 696;
        WhiteCordinator.get(2).XcordinateEnd = 742;
        WhiteCordinator.get(2).top = false;

        WhiteCordinator.put(3, new BoardCordinates());
        WhiteCordinator.get(3).XcordinateBegin = 643;
        WhiteCordinator.get(3).XcordinateEnd = 689;
        WhiteCordinator.get(3).top = false;

        WhiteCordinator.put(4, new BoardCordinates());
        WhiteCordinator.get(4).XcordinateBegin = 590;
        WhiteCordinator.get(4).XcordinateEnd = 636;
        WhiteCordinator.get(4).top = false;

        WhiteCordinator.put(5, new BoardCordinates());
        WhiteCordinator.get(5).XcordinateBegin = 537;
        WhiteCordinator.get(5).XcordinateEnd = 583;
        WhiteCordinator.get(5).top = false;

        WhiteCordinator.put(6, new BoardCordinates());
        WhiteCordinator.get(6).XcordinateBegin = 483;
        WhiteCordinator.get(6).XcordinateEnd = 529;
        WhiteCordinator.get(6).top = false;

        WhiteCordinator.put(7, new BoardCordinates());
        WhiteCordinator.get(7).XcordinateBegin = 379;
        WhiteCordinator.get(7).XcordinateEnd = 425;
        WhiteCordinator.get(7).top = false;

        WhiteCordinator.put(8, new BoardCordinates());
        WhiteCordinator.get(8).XcordinateBegin = 325;
        WhiteCordinator.get(8).XcordinateEnd = 371;
        WhiteCordinator.get(8).top = false;

        WhiteCordinator.put(9, new BoardCordinates());
        WhiteCordinator.get(9).XcordinateBegin = 272;
        WhiteCordinator.get(9).XcordinateEnd = 318;
        WhiteCordinator.get(9).top = false;

        WhiteCordinator.put(10, new BoardCordinates());
        WhiteCordinator.get(10).XcordinateBegin = 220;
        WhiteCordinator.get(10).XcordinateEnd = 266;
        WhiteCordinator.get(10).top = false;

        WhiteCordinator.put(11, new BoardCordinates());
        WhiteCordinator.get(11).XcordinateBegin = 167;
        WhiteCordinator.get(11).XcordinateEnd = 213;
        WhiteCordinator.get(11).top = false;

        WhiteCordinator.put(12, new BoardCordinates());
        WhiteCordinator.get(12).XcordinateBegin = 114;
        WhiteCordinator.get(12).XcordinateEnd = 160;
        WhiteCordinator.get(12).top = false;

        WhiteCordinator.put(24, new BoardCordinates());
        WhiteCordinator.get(24).XcordinateBegin = 749;
        WhiteCordinator.get(24).XcordinateEnd = 795;
        WhiteCordinator.get(24).top = true;

        WhiteCordinator.put(23, new BoardCordinates());
        WhiteCordinator.get(23).XcordinateBegin = 696;
        WhiteCordinator.get(23).XcordinateEnd = 742;
        WhiteCordinator.get(23).top = true;

        WhiteCordinator.put(22, new BoardCordinates());
        WhiteCordinator.get(22).XcordinateBegin = 643;
        WhiteCordinator.get(22).XcordinateEnd = 689;
        WhiteCordinator.get(22).top = true;

        WhiteCordinator.put(21, new BoardCordinates());
        WhiteCordinator.get(21).XcordinateBegin = 590;
        WhiteCordinator.get(21).XcordinateEnd = 636;
        WhiteCordinator.get(21).top = true;

        WhiteCordinator.put(20, new BoardCordinates());
        WhiteCordinator.get(20).XcordinateBegin = 537;
        WhiteCordinator.get(20).XcordinateEnd = 583;
        WhiteCordinator.get(20).top = true;

        WhiteCordinator.put(19, new BoardCordinates());
        WhiteCordinator.get(19).XcordinateBegin = 483;
        WhiteCordinator.get(19).XcordinateEnd = 529;
        WhiteCordinator.get(19).top = true;

        WhiteCordinator.put(18, new BoardCordinates());
        WhiteCordinator.get(18).XcordinateBegin = 379;
        WhiteCordinator.get(18).XcordinateEnd = 425;
        WhiteCordinator.get(18).top = true;

        WhiteCordinator.put(17, new BoardCordinates());
        WhiteCordinator.get(17).XcordinateBegin = 325;
        WhiteCordinator.get(17).XcordinateEnd = 371;
        WhiteCordinator.get(17).top = true;

        WhiteCordinator.put(16, new BoardCordinates());
        WhiteCordinator.get(16).XcordinateBegin = 272;
        WhiteCordinator.get(16).XcordinateEnd = 318;
        WhiteCordinator.get(16).top = true;

        WhiteCordinator.put(15, new BoardCordinates());
        WhiteCordinator.get(15).XcordinateBegin = 220;
        WhiteCordinator.get(15).XcordinateEnd = 266;
        WhiteCordinator.get(15).top = true;

        WhiteCordinator.put(14, new BoardCordinates());
        WhiteCordinator.get(14).XcordinateBegin = 167;
        WhiteCordinator.get(14).XcordinateEnd = 213;
        WhiteCordinator.get(14).top = true;

        WhiteCordinator.put(13, new BoardCordinates());
        WhiteCordinator.get(13).XcordinateBegin = 114;
        WhiteCordinator.get(13).XcordinateEnd = 160;
        WhiteCordinator.get(13).top = true;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(bufferedImagebg, 0, 0, null);
        g.drawImage(bufferedImage, 0, 0, null);
        g.setColor(Color.BLACK);
        dice.paint((Graphics2D) g);

        for (Piece piece : Pices) {
            if(piece.color == "black"){
                g.drawImage(blackPiece, piece.x, piece.y, null);
            }
            else{
                g.drawImage(whitePiece, piece.x, piece.y, null);
            }
        }

    }
}
